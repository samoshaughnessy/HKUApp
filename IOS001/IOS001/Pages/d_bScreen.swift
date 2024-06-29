//
//  d_bScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 27/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared



struct D_bScreen: View {
    @State    var tapped = false

    var body: some View {
        ScrollView{
            HStack{
                NavigationLink(destination: BurgerMenu()){
                    Image(systemName: "line.3.horizontal").resizable().frame(width: 30, height: 30).foregroundColor(.black)
            }.frame(width: 50)
                Spacer()
                Text("精神健康覆核審裁（MHRT)").lineLimit(3).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).foregroundColor(.white).onTapGesture {
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
                Text("精神健康\n" + "覆核審裁（MHRT)").lineLimit(2).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Text("\n點擊下面的連結以下載精神健康覆核審裁處申請表格。請確保根據處理您有條件釋放的醫院聯網選擇正確的申請表格。" + "（例如：如果是九龍西聯網處理您的案件，請選擇九龍西聯網（中）精神健康覆核審裁處申請表格以繼續您的申請。）").font(Font.system(size: 20))
                
                // hyperlink text
                Link("\n[點擊這裡]\n", destination: URL(string: "https://drive.google.com/drive/folders/112hh4dKkwt3d8RsNfBCiQAC0YjMff-Cm?usp=drive_link")!).lineLimit(5).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Text("精神健康覆核審裁處（MHRT）負責處理有條件釋放令下的覆核，並決定申請人是否適合被解除有條件釋放令。MHRT由一名具有適當法律經驗的主席、一名醫生、一名社工和一名具備行政或臨床心理學經驗或知識或其他資格或經驗的人組成。 \n \n" +
                     "覆核申請時，您可以獲得如下幫助：") .font(Font.system(size: 20))
                
                BulletList(items: ["條件釋放令下的服務對象轉介至精神健康覆核審裁處申請表格往往可以在醫院填寫。在醫院填表時，可以獲得醫務社工的協助", "一般來說，當您提出覆核申請時，申訴專員不應該詢問您多餘的問題", "詢問機當局及提出覆核申請的過程，建議您盡量採用書面形式，如是口頭形式，建議盡量錄音，保留溝通過程中的證據，以防醫院施加不合理的條件", "可由您或您的親屬提出申請；申請法律援助以支付法律代表的費用；", "您有權在法律代表或其他授權代表的陪同下出席覆核申請聆訊；"])
                
                Text("聯絡精神健康\n" +
                     "覆核審裁處").lineLimit(2).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                HStack{
                    Spacer()
                    Image(.hongKongFlag2).resizable().frame(width: 100, height: 100)
                    Spacer()}
                
                Text("精神健康覆核審裁處" +
                     "香港添馬添美道2號政府總部東翼19樓\n").lineLimit(6).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                //            Text("\n+852 2594 5636\n").lineLimit(2).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).onTapGesture {
                //                guard let number = URL(string: "tel://" + "+85225945636") else {
                //                    return
                //                }
                //                if UIApplication.shared.canOpenURL(number) {
                //                    UIApplication.shared.open(number)
                //                } else {
                //                    print("Can't open url on this device")
                //                }
                //            }
                
                
                // May work on phone not too sure?
                Link("+852 2594 5636", destination: URL(string: "tel:+85225945636")!).lineLimit(2).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Link("https://www.healthbureau.gov.hk/cn/committees/mhrt.htm", destination: URL(string: "https://www.healthbureau.gov.hk/cn/committees/mhrt.htm")!).lineLimit(6).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                HStack{
                    BackButton(destination: {D_aScreen()})
                    HomeButton()
                }
                
                HKULogo()
                
                
            }.padding(20).background(Color.gray).border(Color.gray, width:3).opacity(0.8).padding(10)
        }.background(Image(.jackimage))
    }
    
}

struct D_bScreen_Previews: PreviewProvider {
    static var previews: some View {
        D_bScreen()
    }
}
