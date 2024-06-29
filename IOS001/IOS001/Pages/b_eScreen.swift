//
//  b_eScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 27/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared



struct B_eScreen: View {
    @State    var tapped = false

        var body: some View {
            ScrollView{
                
            VStack(alignment:.leading){
                
                HStack{
                    NavigationLink(destination: BurgerMenu()){
                        Image(systemName: "line.3.horizontal").resizable().frame(width: 30, height: 30).foregroundColor(.black)
                }.frame(width: 50)
                    Spacer()
                    Text("如何申請？").lineLimit(3).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).foregroundColor(.white).onTapGesture {
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
                
                Text("\n如何申請？\n").lineLimit(4).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Text("在大多數情況下，有條件釋放要求您居住在中途宿舍。如有需要，以下信息將指導您如何申請。\n").font(Font.system(size: 20))
                
                Text("• 申請需由精神科醫生及社工提出，經社會福利署 \n 「康復服務中央轉介系統」轉介香港心理衛生會。\n") .font(Font.system(size: 20))
                
                Text(
                    "• 接獲申請後，香港心理衛生會安排您進行評估及安排入宿適應群體生 \n\n" +
                    "• 若您在適應期內能接受及配合宿舍群體生活，便獲接納正式入住。").font(Font.system(size: 20))
                
                Text("\n如何退出中途宿舍服務？\n").font(Font.system(size: 20)).fontWeight(/*@START_MENU_TOKEN@*/.bold/*@END_MENU_TOKEN@*/)
                
                Text("請注意，除非條件已被修訂，否則您無法申請離開。\n").font(Font.system(size: 20))
                
                Text("• 若您未能接受及配合宿舍群體生活，可提出退出服務。 \n\n" +
                     "• 若宿舍服務未能配合您需要，宿舍會與您協議終止服務；並會通知及建議主診醫生及醫務社工作出跟進安排。 \n\n"
                     +
                     "• 若您已完成其復元計劃，精神狀況穩定及具有足夠生活技能，則可協議訂定遷出計劃，遷離宿舍開展獨立生活").font(Font.system(size: 20))
                
                
                
                HStack{
                    BackButton(destination: {B_dScreen()})
                    HomeButton()
                }
                
                HKULogo()
                
                
            }.padding(20).background(Color.gray).border(Color.gray, width:3).opacity(0.8).padding(10)
        }.background(Image(.jackimage))
    }
    
}

struct B_eScreen_Previews: PreviewProvider {
    static var previews: some View {
        B_eScreen()
    }
}
