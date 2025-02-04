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
    @State    var tapped = false

    var body: some View {
        ScrollView{
            
            VStack(alignment:.leading){
                
                HStack{
                    NavigationLink(destination: BurgerMenu()){
                        Image(systemName: "line.3.horizontal").resizable().frame(width: 30, height: 30).foregroundColor(.black)
                }.frame(width: 50)
                    Spacer()
                    Text("可以向精神科醫生提出的問題 ▼").lineLimit(3).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity).multilineTextAlignment(.center).foregroundColor(.black).onTapGesture {
                        tapped = !tapped
                    }
                    Spacer()
                }
                if tapped {
                    VStack{
                        Divider()
                        LinkingButton(destination: { F_aScreen()}, text: "可以向精神科醫生提出的問題")
                        Divider()
                        LinkingButton(destination: { F_bScreen()}, text: "醫生沒有正當理由卻拒絕調整相關限制...")

                    }.onTapGesture {
                        tapped = false
                    }
                }
                
                Divider()
                
                Text("\n可以向精神科醫生提出的問題").lineLimit(4).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity).multilineTextAlignment(.center)
                
                Text("\n為什麼我必須被施加有條件釋放令？ \n\n 我要怎麼做才能使條件放寬？ \n\n 藥物令我感到不適，你能調整我的藥物嗎？ \n\n 我的心理健康狀況診斷結果是什麼？ \n\n 距離我上次診斷已經很久了，我覺得自己好轉了，  你可以再次診斷我嗎 \n").font(Font.system(size: 20))
                
                
                Image(.doctor).resizable().frame(width: 200, height: 300)

                
                NextButton(destination: { F_bScreen()})
                
                HKULogo()
                
                
            }.padding(20).border(Color.gray, width:3).padding(10)
        }.background(Image(.jackimage))
    }
    
}

struct F_aScreen_Previews: PreviewProvider {
    static var previews: some View {
        F_aScreen()
    }
}

