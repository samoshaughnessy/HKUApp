//
//  e_bScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 27/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared



struct E_bScreen: View {
    @State    var tapped = false

    var body: some View {
        ScrollView{
            HStack{
                NavigationLink(destination: BurgerMenu()){
                    Image(systemName: "line.3.horizontal").resizable().frame(width: 30, height: 30).foregroundColor(.black)
            }.frame(width: 50)
                Spacer()
                Text("申請書需要包括哪些內容？").lineLimit(3).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).foregroundColor(.white).onTapGesture {
                    tapped = !tapped
                }
                Spacer()
            }.padding(10).background(Color.gray).border(Color.gray, width:3).opacity(0.85).padding(10)
            if tapped {
                VStack{
                    LinkingButton(destination: { E_aScreen()}, text: "提出覆核申請需要提交哪些資料？")
                    Divider()
                    LinkingButton(destination: { E_bScreen()}, text: "申請書需要包括哪些內容？")

                }.padding(10).background(Color.gray).opacity(0.7).padding(20).onTapGesture {
                    tapped = false
                }
            }
            VStack(alignment:.leading){
                Text("申請書需要包括\n" +
                     "哪些內容？").lineLimit(2).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Text("\n申請書須盡可能包括以下資料：\n ").font(Font.system(size: 20)).fontWeight(/*@START_MENU_TOKEN@*/.bold/*@END_MENU_TOKEN@*/)
                Text("服務對象姓名，以及身分證號碼；").font(Font.system(size: 20))
                
                
                CustomBulletList(items: [CustomBullet(data: "服務對象的地址，包括", decoration: "1.  ", id: 1), CustomBullet(data: "服務對象正被羈留的地方或", decoration: "a.  ", id: 2), CustomBullet(data: "服務對象的非官方監護人姓名及地址，以及監護人的分證的號碼；或", decoration: "b.  ", id: 3), CustomBullet(data: "如已獲有條件釋放或已獲授予離院許可，則須述明服務對象最後被羈留或現時可被羈留的地方，現時的地址，以及規定服務對象須前往就醫的精神科門診診療所的地址；", decoration: "c.  ", id: 4), CustomBullet(data: "該服務對象被羈留或可被留所根據本條例中的條文；", decoration: "2.  ", id: 5)])
                
                
                Text("除此之外： \n" +
                     "1. 凡提出申請的人是服務對象的親屬，則須述明該服務對象的姓名、地址及身分證號碼，以及申請人與該服務對象的關係；\n \n" +
                     "2. 如果服務對象希望授權代表，還需提供授權代表的姓名、地址以及現有身分證的號碼。如仍未授權其他人為代表，則需述明該服務對象是否打算授權代表，抑或是否有意自行處理其個案。 \n \n" +
                     "3. 根據相關規定，如上述指明的任何一項資料並未包括在申請書上，則在切實可行範圍內，負責當局（即院長、醫生、懲教署署長、社會福利署署長等有關人士）須提供該項資料。但我們依然建議您盡可能全面地自行準備相關资料。").font(Font.system(size: 20))
                
                
                HStack{
                    BackButton(destination: {E_aScreen()})
                    HomeButton()
                }
                
                HKULogo()
                
                
            }.padding(20).background(Color.gray).border(Color.gray, width:3).opacity(0.8).padding(10)
        }.background(Image(.jackimage))
    }
    
}

struct E_bScreen_Previews: PreviewProvider {
    static var previews: some View {
        E_bScreen()
    }
}
