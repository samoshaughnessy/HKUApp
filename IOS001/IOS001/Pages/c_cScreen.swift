//
//  c_cScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 27/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared



struct C_cScreen: View {
    @State    var tapped = false

        
    var body: some View {
        ScrollView{
            
            VStack(alignment:.leading){
                
                HStack{
                    NavigationLink(destination: BurgerMenu()){
                        Image(systemName: "line.3.horizontal").resizable().frame(width: 30, height: 30).foregroundColor(.black)
                }.frame(width: 50)
                    Spacer()
                    Text("您的有條件釋放令將會持續多久？").lineLimit(4).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity).multilineTextAlignment(.center).foregroundColor(.white).onTapGesture {
                        tapped = !tapped
                    }
                    Spacer()
                }
                if tapped {
                    VStack{
                        Divider()
                        LinkingButton(destination: { C_aScreen()}, text: "您會被召回醫院嗎？ ▼")
                        Divider()
                        LinkingButton(destination: { C_bScreen()}, text: "有條件釋放令召回 ▼")
                        Divider()
                        LinkingButton(destination: { C_cScreen()}, text: "您的有條件釋放令將會持續多久？ ▼")
                    }.onTapGesture {
                        tapped = false
                    }
                }
                
                Divider()
                
                Text("\n您的有條件釋放令將會持續多久？").lineLimit(6).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity).multilineTextAlignment(.center)
                
                Text("\n再次入院後，有條件釋放令還有效嗎？\n").font(Font.system(size: 20)).fontWeight(.bold)
                
                Text("-有條件釋放令的持續時間不一樣，這取決於醫務人員和院長的決定。 \n\n-但是，它將無限期地持續，一直到您向精神健康覆核審裁處提出的覆核申請成功為止。 \n\n-只有您自己的覆核申請有可能終止有條件釋放令（醫生不能夠法定上解除您的有條件釋放令，但實踐中醫生可以解除您需要遵守的條件) \n\n-根據我們的研究，很多服務對象並不知道有權向精神健康覆核審裁處提出覆核申請。") .font(Font.system(size: 20))
                
                
                HStack{
                    BackButton(destination: {C_bScreen()})
                    HomeButton()
                }
                
                HKULogo()
                
                
            }.padding(20).background(Color.gray).border(Color.gray, width:3).opacity(0.8).padding(10)
        }.background(Image(.jackimage))
    }
    
}

struct C_cScreen_Previews: PreviewProvider {
    static var previews: some View {
        C_cScreen()
    }
}
