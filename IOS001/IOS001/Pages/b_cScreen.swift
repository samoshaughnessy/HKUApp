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
    var body: some View {
        ScrollView{
            VStack(alignment:.leading){
                Text("進入中途宿舍需要哪些條件？\n").lineLimit(2).font(Font.system(size: 35)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                OrderedList(items:["15歲或以上的復元人士", "精神狀況穩定，沒有傳染病、酗酒或濫用藥物", "具有基本自我照顧能力，並與其他人和睦相處", "同意參與個人復原計畫"])
                
                
                
                HStack{
                    BackButton(destination: {B_bScreen()})
                    NextButton(destination: { B_dScreen()})
                }
                
                HKULogo()
                
                
            }.padding(20)
        }.background(Image(.jackimage))
    }
    
}

struct B_cScreen_Previews: PreviewProvider {
    static var previews: some View {
        B_cScreen()
    }
}
