//
//  b_cScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 26/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared



struct B_cScreen: View {
    @State var tapped = false

    var body: some View {
        ScrollView{
        
            VStack(alignment:.leading){
                
                HStack{
                    NavigationLink(destination: BurgerMenu()){
                        Image(systemName: "line.3.horizontal").resizable().frame(width: 30, height: 30).foregroundColor(.black)
                }.frame(width: 50)
                    Spacer()
                    Text("進入中途宿舍需要哪些條件？ ▼").lineLimit(3).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity).multilineTextAlignment(.center).foregroundColor(.black).onTapGesture {
                        tapped = !tapped
                    }
                    Spacer()
                }
                if tapped {
                    VStack{
                        Divider()
                        LinkingButton(destination: { B_aScreen()}, text: "什麼是中途宿舍?")
                        Divider()
                        LinkingButton(destination: { B_bScreen()}, text: "香港中途宿舍位置")
                        Divider()
                        LinkingButton(destination: { B_cScreen()}, text: "進入中途宿舍需要哪些條件？")
                        Divider()
                        LinkingButton(destination: { B_dScreen()}, text: "中途宿舍額外限制")
                        Divider()
                        LinkingButton(destination: { B_eScreen()}, text: "如何申請？")

                    }.onTapGesture {
                        tapped = false
                    }
                }
                Divider()
                Text("\n進入中途宿舍需要哪些條件？").lineLimit(4).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity).multilineTextAlignment(.center)
                
                OrderedList(items:["15歲或以上的復元人士", "精神狀況穩定，沒有傳染病、酗酒或濫用藥物", "具有基本自我照顧能力，並與其他人和睦相處", "同意參與個人復原計畫"])
                
                
                
                HStack{
                    BackButton(destination: {B_bScreen()})
                    NextButton(destination: { B_dScreen()})
                }
                
                HKULogo()
                
                
            }.padding(20).border(Color.gray, width:3).padding(10)
        }.background(Image(.jackimage))
    }
    
}

struct B_cScreen_Previews: PreviewProvider {
    static var previews: some View {
        B_cScreen()
    }
}
