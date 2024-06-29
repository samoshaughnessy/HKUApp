//
//  g_aScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 27/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared




struct G_aScreen: View {
    var body: some View {
        ScrollView{
            HStack{
                NavigationLink(destination: BurgerMenu()){
                    Image(systemName: "line.3.horizontal").resizable().frame(width: 30, height: 30).foregroundColor(.black)
            }.frame(width: 50)
                Spacer()
                Text("有條件釋放者是否了解他們的情況").lineLimit(3).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).foregroundColor(.white)
                Spacer()
            }.padding(10).background(Color.gray).border(Color.gray, width:3).opacity(0.85).padding(10)
            VStack(alignment:.leading){
                
                Text("有條件釋放者\n" +
                     "是否了解\n" +
                     "他們的情況").lineLimit(6).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                
                let columns = [
                    GridItem(.fixed(220), spacing: 1),
                    GridItem(.fixed(60), spacing: 1),
                    GridItem(.fixed(60), spacing: 1),
                ]
                
                LazyVGrid(columns: columns){
                    GridRow{
                        Text("問題").frame(width:215,height: 50).background(Color.teal)
                        Text("YES").frame(width:55,height: 50).background(Color.teal)
                        Text("NO").frame(width:55,height: 50).background(Color.teal)
                    }
                    GridRow{
                        Text("您理解您身處的有條件釋放制度嗎？")
                        Text("36.2%")
                        Text("63.8%")
                    }.padding(5).frame(height: 80).border(Color.white).background(Color.blue)
                    GridRow{
                        Text("您理解有條件釋放令的監管條件嗎？")
                        Text("70.2%")
                        Text("29.8%")
                    }.padding(5).frame(height: 80).border(Color.white).background(Color.gray)
                    GridRow{
                        Text("您知道如何終止您的有條件釋放令嗎？")
                        Text("25.5%")
                        Text("74.5%")
                    }.padding(5).frame(height: 80).border(Color.white).background(Color.blue)
                    GridRow{
                        Text("您是否知道您有權向精神健康覆核審裁處（MHRT）提出覆核申請以解除您的有條件釋放令？")
                        Text("27.7%")
                        Text("72.3%")
                    }.padding(5).frame(height: 100).border(Color.white).background(Color.gray)
                    GridRow{
                        Text("首次申請無條件釋放成功率")
                        Text("2.3%")
                        Text("97.7%")
                    }.padding(5).frame(height: 80).border(Color.white).background(Color.blue)
                    GridRow{
                        Text("您是否知道您所擁有的權利?").frame(width:210)
                        Text("9.3%")
                        Text("91.7%")
                    }.padding(5).frame(height: 80).border(Color.white).background(Color.gray)
                    
                }
                
                Text("\n來源:").font(Font.system(size: 20)) + Text("Cheung D. (2022). Control in the community: A qualitative analysis of the experience of persons on conditional discharge in Hong Kong. International journal of law and psychiatry, 82").font(Font.system(size: 20)).italic().fontWeight(/*@START_MENU_TOKEN@*/.bold/*@END_MENU_TOKEN@*/)
                
                HomeButton()
                HKULogo()
                
                
            }.padding(20).background(Color.gray).border(Color.gray, width:3).opacity(0.8).padding(10)
        }.background(Image(.jackimage))
    }
    
}

struct G_aScreen_Previews: PreviewProvider {
    static var previews: some View {
        G_aScreen()
    }
}
