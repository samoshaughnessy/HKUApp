//
//  f_bScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 27/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared



struct F_bScreen: View {
    
    var body: some View {
        ScrollView{
            VStack(alignment:.leading){
                
                
                // center item better
                Text("醫生沒有正\n當理由卻拒絕\n調整相關限制...").frame(maxWidth: .infinity, alignment: .center).lineLimit(6).font(Font.system(size: 35)).fontWeight(.bold)
                
                Text("\n如果醫生沒有正當理由卻拒絕調整您的相關限制，您可以聯絡所在醫院的病人聯絡主任辦公室。爲了保證您的訴求得到合適的處理，您可以考慮書面記錄過程。 我要怎麼做才能使條件放寬？\n\n").font(Font.system(size: 20))
                Text("您的記錄最後可以以表格形式呈現，盡可能詳細地記錄您在何時、何地向誰提出過怎樣的訴求，獲得了怎樣的回覆。一份合理且詳細的書面記錄可以幫助您 跟進相關事項的進度，同 時在您\n").font(Font.system(size: 20))
                
                Text("需要維護自身權 利時作爲證據支持").font(Font.system(size: 20))
                
                Image(.doctor).resizable().frame(width: 200, height: 300)
                
                HStack{
                    BackButton(destination: {F_aScreen()})
                    HomeButton()
                }
                
                HKULogo()
                
                
            }.padding(20)
        }.background(Image(.jackimage))
    }
}

struct F_bScreen_Previews: PreviewProvider {
    static var previews: some View {
        F_bScreen()
    }
}
