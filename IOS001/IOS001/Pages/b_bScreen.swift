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
    var body: some View {
        ScrollView{
            VStack(alignment:.leading){
                Text("香港中途宿舍位置\n").lineLimit(2).font(Font.system(size: 35)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Text("顯徑宿舍").font(Font.system(size: 20)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .leading).padding(10)
                
                HalfwayHomeList(items:["新界沙田顯徑邨顯祐樓B 翼地下及 2 樓", "+852 2695 7805", "+852 2691 2507", "hkh@mhahk.org.hk"])
                
                Text("艾齡樓").font(Font.system(size: 20)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .leading).padding(10)
                
                
                HalfwayHomeList(items: ["九龍黃大仙黃大仙下邨龍吉樓地下及2樓", "+852 2320 2511", "+852 2327 8596", "ireneh@mhahk.org.hk"])
                
                Text("李鄭屋宿舍").font(Font.system(size: 20)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .leading).padding(10)
                
                HalfwayHomeList(items: ["九龍深水埗李鄭屋邨李孝慈樓 B 翼地下及 2 樓", "+852 2725 9232", "+852 2720 7974", "lcuh@mhahk.org.hk"])
                
                Text("敦睦軒 (特建中途宿舍)").font(Font.system(size: 20)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .leading).padding(10)
                
                HalfwayHomeList(items: ["九龍觀塘功樂道 2 號 5 樓", "+852 2172 6036", "+852 2172 6219", "jcbhwh1@mhahk.org.hk"])
                
                Text("廣福宿舍").font(Font.system(size: 20)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .leading).padding(10)
                
                HalfwayHomeList(items: ["新界大埔廣福邨廣崇樓 B 翼地下及 2 樓", "+852 2651 8948", "+852 2656 9211", "kfh@mhahk.org.hk"])
                
                Text("欣怡軒 (特建中途宿舍").font(Font.system(size: 20)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .leading).padding(10)
                
                HalfwayHomeList(items: ["九龍觀塘功樂道 2 號 6 樓", "+852 2172 7970", "+852 2340 5955", "jcbhwh2@mhahk.org.hk"])
                
                HStack{
                    BackButton(destination: { B_aScreen()})
                    NextButton(destination: { B_cScreen()})
                }
                
                HKULogo()
                
                
            }.padding(20)
        }.background(Image(.jackimage))
    }
    
}

struct B_bScreen_Previews: PreviewProvider {
    static var previews: some View {
        B_bScreen()
    }
}
