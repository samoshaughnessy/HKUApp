//
//  b_dScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 27/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared

struct B_dScreen: View {
    @State    var tapped = false
    
    var body: some View {
        
        ScrollView{
            HStack{
                
                NavigationLink(destination: BurgerMenu()){
                    Image(systemName: "line.3.horizontal").resizable().frame(width: 30, height: 30).foregroundColor(.black)
            }.frame(width: 50)
                
                Spacer()
                Text("中途宿舍額外限制").lineLimit(3).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).foregroundColor(.white).onTapGesture {
                    tapped = !tapped
                }
                Spacer()
            }.padding(10).background(Color.gray).border(Color.gray, width:3).opacity(0.85).padding(10)
            
            if tapped {
                VStack{
                    LinkingButton(destination: { B_aScreen()}, text: "什麼是中途宿舍?")
                    Divider()
                    LinkingButton(destination: { B_bScreen()}, text: "香港中途宿舍位置")
                    Divider()
                    LinkingButton(destination: { B_cScreen()}, text: "進入中途宿舍需要哪些條件？")
                    Divider()
                    LinkingButton(destination: { B_dScreen()}, text: "中途宿舍額外限制")
                    Divider()
                    LinkingButton(destination: { B_eScreen()}, text: "如何申請？")
                }.padding(10).background(Color.gray).opacity(0.7).padding(20).onTapGesture {
                    tapped = false
                }
            }
            
            VStack(alignment:.leading){
                
                Text("中途宿舍額外限制").lineLimit(2).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Text("\n中途宿舍可能施加額外限制，例如：").font(Font.system(size: 20))
                
                IndentedBulletList(items: ["宵禁（或會影響您的工作；", "在一定範圍內限制您的財務自由；", "規定您在首次入住中途宿舍的數周或數月內，不得離開中途宿舍。"], indentedItem: "可能：入住首三個月外出要登記")
                
                Text("\n如果您發現中途宿舍的限制不合理，該怎麼辦？\n\n-尋求律師和非政府組織的\n（聯繫方式見後）\n\n-向有關當局，如申訴專員公署提出投訴\n\n其他選擇：向社會福利署提出申訴").font(Font.system(size: 20))
                
                HStack{
                    BackButton(destination: {B_cScreen()})
                    NextButton(destination: { B_eScreen()})
                }
                
                HKULogo()
                
                
            }.padding(20).background(Color.gray).border(Color.gray, width:3).opacity(0.8).padding(10)
            
        }.background(Image(.jackimage))
    }
    
}

struct B_dScreen_Previews: PreviewProvider {
    static var previews: some View {
        B_dScreen()
    }
}
