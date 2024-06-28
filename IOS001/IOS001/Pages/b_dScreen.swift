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
    var body: some View {
        
        ScrollView{
            
            VStack(alignment:.leading){
                
                Text("中途宿舍額外限制").lineLimit(2).font(Font.system(size: 35)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Text("\n中途宿舍可能施加額外限制，例如：").font(Font.system(size: 20))
                
                IndentedBulletList(items: ["宵禁（或會影響您的工作；", "在一定範圍內限制您的財務自由；", "規定您在首次入住中途宿舍的數周或數月內，不得離開中途宿舍。"], indentedItem: "可能：入住首三個月外出要登記")
                
                Text("\n如果您發現中途宿舍的限制不合理，該怎麼辦？\n \n" +
                     "-尋求律師和非政府組織的\n" +
                     "（聯繫方式見後）\n\n" +
                     "-向有關當局，如申訴專員公署提出投訴\n\n" + "其他選擇：向社會福利署提出申訴").font(Font.system(size: 20))
                
                HStack{
                    BackButton(destination: {B_cScreen()})
                    NextButton(destination: { B_eScreen()})
                }
                
                HKULogo()
                
                
            }.padding(20)
            
        }.background(Image(.jackimage))
    }
    
}

struct B_dScreen_Previews: PreviewProvider {
    static var previews: some View {
        B_dScreen()
    }
}
