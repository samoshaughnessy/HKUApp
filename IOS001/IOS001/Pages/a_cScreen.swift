//
//  a_cScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 26/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared



struct A_cScreen: View {
    var body: some View {
        ScrollView {
            VStack(alignment:.leading){
                Text("什麼是“條件”？").lineLimit(2).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Text("\n由院長在簽署釋放令時施加; \n 常見規限條件包括: \n 居住在指定地點（比如中途宿舍）\n" +
                     "-服用指定藥物\n\n" +
                     "-定期到院長指定的診所覆診\n\n" +
                     "-接受社會福利署署長監督\n").font(Font.system(size: 20))
                
                Text("•  理論上院長可以施加").font(Font.system(size: 20))
                Text("一切合理").font(Font.system(size: 20)).foregroundColor(.blue) +
                Text("的條件，沒有明確的禁止\n\n").font(Font.system(size: 20))
                
                Text("什麼是“合理”？").font(Font.system(size: 20)).fontWeight(.bold)
                
                BulletList(items: ["對控制病情、確保人身安全有實際作用", "與該人所患的病情相關", "與病情相應，不能在不必要的情況下侵犯個人生活"])
                
                HStack{
                    BackButton(destination: {A_bScreen()})
                    HomeButton()
                }
                
                HKULogo()
                
                
            }.padding(20)
        }.background(Image(.jackimage))
    }
    
}

struct A_cScreen_Previews: PreviewProvider {
    static var previews: some View {
        A_cScreen()
    }
}
