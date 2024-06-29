//
//  c_bScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 27/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared



struct C_bScreen: View {
    @State    var tapped = false

    var body: some View {
        ScrollView{
            
            VStack(alignment:.leading){
                
                HStack{
                    NavigationLink(destination: BurgerMenu()){
                        Image(systemName: "line.3.horizontal").resizable().frame(width: 30, height: 30).foregroundColor(.black)
                }.frame(width: 50)
                    Spacer()
                    Text("有條件釋放令召回").lineLimit(3).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).foregroundColor(.white).onTapGesture {
                        tapped = !tapped
                    }
                    Spacer()
                }
                if tapped {
                    VStack{
                        Divider()
                        LinkingButton(destination: { C_aScreen()}, text: "您會被召回醫院嗎？")
                        Divider()
                        LinkingButton(destination: { C_bScreen()}, text: "有條件釋放令召回")
                        Divider()
                        LinkingButton(destination: { C_cScreen()}, text: "您的有條件釋放令將會持續多久？")
                    }.onTapGesture {
                        tapped = false
                    }
                }
                
                Divider()
                
                Text("\n有條件釋放令召回\n").lineLimit(4).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Text("再次入院後，有條件釋放令還有效嗎？\n").font(Font.system(size: 20)).fontWeight(.bold)
                
                Text("-如果您被強制重新送進醫院，原有的有條件釋放令將不再有效。當您被釋放時，院長可能會發佈新的有條件釋放令；\n \n" +
                     "-如果您非正式地重新入院（對於非正式的界定，每個醫院的要求不同，建議您向所在醫院詢問清楚）或自願入院，或入住醫院的非精神科病房，有條件釋放令仍然有效；") .font(Font.system(size: 20))
                
                
                HStack{
                    BackButton(destination: {C_aScreen()})
                    NextButton(destination: { C_cScreen()})
                }
                
                HKULogo()
                
                
            }.padding(20).background(Color.gray).border(Color.gray, width:3).opacity(0.8).padding(10)
        }.background(Image(.jackimage))
    }
    
}

struct C_bScreen_Previews: PreviewProvider {
    static var previews: some View {
        C_bScreen()
    }
}
