//
//  e_aScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 27/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared



struct E_aScreen: View {
    @State    var tapped = false

    var body: some View {
        ScrollView{
           
            VStack(alignment:.leading){
                
                HStack{
                    NavigationLink(destination: BurgerMenu()){
                        Image(systemName: "line.3.horizontal").resizable().frame(width: 30, height: 30).foregroundColor(.black)
                }.frame(width: 50)
                    Spacer()
                    Text("提出覆核申請需要\n提交哪些資料？").lineLimit(3).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity).multilineTextAlignment(.center).foregroundColor(.white).onTapGesture {
                        tapped = !tapped
                    }
                    Spacer()
                }
                if tapped {
                    VStack{
                        Divider()
                        LinkingButton(destination: { E_aScreen()}, text: "提出覆核申請需要提交哪些資料？")
                        Divider()
                        LinkingButton(destination: { E_bScreen()}, text: "申請書需要包括哪些內容？")

                    }.onTapGesture {
                        tapped = false
                    }
                }
                
                Divider()
                
                
                Text("\n提出覆核申請需要提交哪些資料？").lineLimit(4).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity).multilineTextAlignment(.center)
                
                Text("\n根據《精神健康覆核審裁處規則》第136C章，第II部第3條規定：\n\n1.申請必須以書面提出 \n").font(Font.system(size: 20))
                
                
                
                Text("2.申請書須由服務對象").font(Font.system(size: 20))+Text("或").font(Font.system(size: 20)).fontWeight(/*@START_MENU_TOKEN@*/.bold/*@END_MENU_TOKEN@*/)+Text("由任何獲得服務對象授權代其提出申請的人簽署。").font(Font.system(size: 20))
                
                
                NextButton(destination: { E_bScreen()})
                
                HKULogo()
                
                
            }.padding(20).background(Color.gray).border(Color.gray, width:3).opacity(0.8).padding(10)
        }.background(Image(.jackimage))
    }
    
}

struct E_aScreen_Previews: PreviewProvider {
    static var previews: some View {
        E_aScreen()
    }
}
