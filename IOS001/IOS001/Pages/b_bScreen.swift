//
//  b_bScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 26/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared

struct B_bScreen: View {    
    @State    var tapped = false
    
    var body: some View {
        
        
        
        ScrollView{
            
            VStack(alignment:.leading){
                
                HStack{
                    NavigationLink(destination: BurgerMenu()){
                        Image(systemName: "line.3.horizontal").resizable().frame(width: 30, height: 30).foregroundColor(.black)
                }.frame(width: 50)
                    
                    Spacer()
                    Text("香港中途宿舍位置 ▼").lineLimit(3).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).foregroundColor(.black).onTapGesture {
                        tapped = !tapped
                    }
                    Spacer()
                }
                
                if tapped {
                    VStack{
                        Divider()
                        LinkingButton(destination: { B_aScreen()}, text: "\n什麼是中途宿舍?")
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
                Text("\n香港中途宿舍位置").lineLimit(4).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Text("\n點擊下面的鏈接查看香港所有中途宿舍的完整列表。該列表包括地址和重要的聯絡信息。\n").font(Font.system(size: 20)).frame(maxWidth: .infinity, alignment: .leading)
                
                
                Link("點擊這裡", destination: URL(string: "https://www.swd.gov.hk/storage/asset/section/675/tc/HWH_Aug_2022.pdf")!).lineLimit(5).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
               
                
                HStack{
                    BackButton(destination: { B_aScreen()})
                    NextButton(destination: { B_cScreen()})
                }
                
                HKULogo()
                
                
            }.padding(20).border(Color.gray, width:3).padding(10)
        }.background(Image(.jackimage))
    }
    
}

struct B_bScreen_Previews: PreviewProvider {
    static var previews: some View {
        B_bScreen()
    }
}
