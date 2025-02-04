//
//  a_aScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 26/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared


struct A_aScreen: View {
    @State    var tapped = false
    var body: some View {
        ScrollView{

            VStack(alignment:.leading){
                
                HStack{
                    NavigationLink(destination: BurgerMenu()){
                        Image(systemName: "line.3.horizontal").resizable().frame(width: 30, height: 30).foregroundColor(.black)
                }.frame(width: 50)
                    Spacer()
                    Text("什麼是有條件釋放？ ▼").lineLimit(3).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).foregroundColor(.black).onTapGesture {
                        tapped = !tapped
                    }
                    Spacer()
                }
                if tapped {
                    VStack{
                        LinkingButton(destination: { A_aScreen()}, text: "\n什麼是有條件釋放？")
                        Divider()
                        LinkingButton(destination: { A_bScreen()}, text: "病人在有條件下獲釋放出院的命令摹本")
                        Divider()
                        LinkingButton(destination: { A_cScreen()}, text: "什麼是“條件”？")
                    }.onTapGesture {
                        tapped = false
                    }
                }
                
                Divider()
                Text("\n什麼是有條件釋放？").lineLimit(4).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Text("\n相比於無條件釋放，有條件釋放令要求您出院後遵守一些特定的條件，如果您未遵守這些條件，而院長認為基於您的健康或安全，或為保護他人著想而有需要有可能將您重新召回精神病院。\n").font(Font.system(size: 20))
                
                Text("相關條例").font(Font.system(size: 20))
                
                Text("  《精神健康條例》（第136章）\n第42B條").fontWeight(.bold)
                
                
                Text("\n若病人獲准出院或將對社會構成風險，院長可發出有條件釋放令並施加條件，以限制相關病人出院後的自由。在該法例下，有條件釋放需符合兩個條件:  \n \n 1）院長覺得該名病人有刑事暴力的病例，或有使用刑事暴力的傾向；但 \n \n 2）院長認為，在釋放令所指明條件的規限下，可安全地將該病人釋放。 \n \n 若獲有條件釋放的病人沒有遵守基於第42B條第3款所規限的任何條件，該名病人或將被重新召回醫院。\n").font(Font.system(size: 20))
                
                
                NextButton(destination: { A_bScreen()})
                
                
                HKULogo()
                
                
            }.padding(20).border(Color.gray, width:3).padding(10)
        }.background(Image(.jackimage))
    }
    
}

struct A_aScreen_Previews: PreviewProvider {
    static var previews: some View {
        A_aScreen()
    }
}
