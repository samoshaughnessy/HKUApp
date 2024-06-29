//
//  d_aScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 27/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared



struct D_aScreen: View {
    @State    var tapped = false

    var body: some View {
        ScrollView{
            HStack{
                NavigationLink(destination: BurgerMenu()){
                    Image(systemName: "line.3.horizontal").resizable().frame(width: 30, height: 30).foregroundColor(.black)
            }.frame(width: 50)
                Spacer()
                Text("如果有條件釋放令不合理").lineLimit(3).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).foregroundColor(.white).onTapGesture {
                    tapped = !tapped
                }
                Spacer()
            }.padding(10).background(Color.gray).border(Color.gray, width:3).opacity(0.85).padding(10)
            if tapped {
                VStack{
                    LinkingButton(destination: { D_aScreen()}, text: "如果有條件釋放令不合理")
                    Divider()
                    LinkingButton(destination: { D_bScreen()}, text: "精神健康覆核審裁（MHRT)")

                }.padding(10).background(Color.gray).opacity(0.7).padding(20).onTapGesture {
                    tapped = false
                }
            }
            VStack(alignment:.leading){
                Text("如果有條件釋\n放令不合理").lineLimit(2).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Text("\n點擊下面的連結以下載精神健康覆核審裁處申請表格。請確保根據處理您有條件釋放的醫院聯網選擇正確的申請表格。" + "（例如：如果是九龍西聯網處理您的案件，請選擇九龍西聯網（中）精神健康覆核審裁處申請表格以繼續您的申請。）").font(Font.system(size: 20))
                
                // hyperlink text
                Link("\n[點擊這裡]\n", destination: URL(string: "https://drive.google.com/drive/folders/112hh4dKkwt3d8RsNfBCiQAC0YjMff-Cm?usp=drive_link")!).lineLimit(5).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                
                Text("向精神健康覆核審裁處申請覆核您的有條件釋放令\n") .font(Font.system(size: 20)).fontWeight(/*@START_MENU_TOKEN@*/.bold/*@END_MENU_TOKEN@*/)
                
                Text("-您每年只能對您的有條件釋放令提出覆核申請一次 \n \n" +
                     "-您必須親自向精神健康覆核審裁處提出覆核申請，因為醫務人員不會將處於有條件釋放令下的服務對象轉介至精神健康覆核審裁處； \n \n" +
                     "-即使院長認為不需要再對服務對象進行隔離治療，院長也沒有辦法直接釋放服務對象；\n \n" +
                     "-解除或取消：只有精神健康覆核審裁處有權力；醫務人員和院長沒有權力直接解除或者取消有條件釋放令，但是實踐中醫生可以解除您需要遵守的全部條件，從而達到同樣效果").font(Font.system(size: 20))
                
                NextButton(destination: { D_bScreen()})
                
                HKULogo()
                
                
            }.padding(20).background(Color.gray).border(Color.gray, width:3).opacity(0.8).padding(10)
        }.background(Image(.jackimage))
    }
    
}

struct D_aScreen_Previews: PreviewProvider {
    static var previews: some View {
        D_aScreen()
    }
}
