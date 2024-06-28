//
//  f_aScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 27/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared



struct F_aScreen: View {
    
    var body: some View {
        ScrollView{
            VStack(alignment:.leading){
                
                Text("可以向精神科醫生\n" +
                     "提出的問題").lineLimit(2).font(Font.system(size: 35)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Text("\n為什麼我必須被施加有條件釋放令？ \n\n 我要怎麼做才能使條件放寬？ \n\n 藥物令我感到不適，你能調整我的藥物嗎？ \n\n 我的心理健康狀況診斷結果是什麼？ \n\n 距離我上次診斷已經很久了，我覺得自己好轉了，  你可以再次診斷我嗎 \n").font(Font.system(size: 20))
                
                
                Image(.doctor).resizable().frame(width: 100, height: 150, alignment: .center)
                
                NextButton(destination: { F_bScreen()})
                
                HKULogo()
                
                
            }.padding(20)
        }.background(Image(.jackimage))
    }
    
}

struct F_aScreen_Previews: PreviewProvider {
    static var previews: some View {
        F_aScreen()
    }
}

