//
//  h_aScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 27/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared



struct H_aScreen: View {
    
    var body: some View {
        ScrollView{
            
            VStack(alignment:.leading){
                Text("重要聯絡人").lineLimit(2).font(Font.system(size: 35)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Text("如果認為施加的條件不合理，您可以聯絡律師或專業人士確認條件是否不合理:\n").font(Font.system(size: 20)).fontWeight(/*@START_MENU_TOKEN@*/.bold/*@END_MENU_TOKEN@*/)
                
                HStack{
                    Spacer()
                    Image(.logo2).resizable().frame(width: 200, height: 100)
                    Spacer()}
                Text("法律援助署").font(Font.system(size: 20)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Link("ladinfo@lad.gov.hk", destination: URL(string: "mailto:ladinfo@lad.gov.hk")!).foregroundColor(Color.black).lineLimit(2).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Link("+852 2537 7677", destination: URL(string: "tel:+85225377677")!).lineLimit(2).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).foregroundColor(.black)
                Text("香港金鐘道66號政府合署\n").font(Font.system(size: 20)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                
                HStack{
                    Spacer()
                    Image(.concordMutualAid).resizable().frame(width: 200, height: 200)
                    Spacer()}
                Text("康和互助社聯會").font(Font.system(size: 20)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Link("concord.maca@gmail.com", destination: URL(string: "mailto:concord.maca@gmail.com")!).foregroundColor(Color.black).lineLimit(2).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Link("+852 3586 0567", destination: URL(string: "tel:+85235860567")!).lineLimit(2).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).foregroundColor(.black)
                
                Link("+852 6826 0720", destination: URL(string: "tel:+85268260720")!).lineLimit(2).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).foregroundColor(.black)
                
                Text("石硤尾南山邨南逸樓地下3-10號\n").font(Font.system(size: 20)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Link("https://concordorghk.wordpress.com/", destination: URL(string: "https://concordorghk.wordpress.com/")!).lineLimit(5).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).foregroundColor(.black)
                
                HStack{
                    Spacer()
                    Image(.hkDignity).resizable().frame(width: 200, height: 200)
                    Spacer()}
                Text("香港守護尊嚴中心").font(Font.system(size: 20)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Link("info@dignityinstitute.com", destination: URL(string: "mailto:info@dignityinstitute.com")!).foregroundColor(Color.black).lineLimit(2).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Link("+852 9728 5969", destination: URL(string: "tel:+85297285969")!).lineLimit(2).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).foregroundColor(.black)
                
                Text("P.O. Box 28557\n" +
                     "香港告士打道郵政局").font(Font.system(size: 20)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Link("https://www.dignityinstitute.com", destination: URL(string: "https://www.dignityinstitute.com")!).lineLimit(5).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).foregroundColor(.black)
                
                
                HStack{
                    Spacer()
                    Image(.hongKongFlag2).resizable().frame(width: 100, height: 100)
                    Spacer()}
                
                Text("精神健康覆核審裁處香港添馬添美道2號政府總部東翼19樓").lineLimit(2).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                // May work on phone not too sure?
                Link("+852 2594 5636", destination: URL(string: "tel:+85225945636")!).lineLimit(2).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).foregroundColor(.black)
                
                Link("https://www.healthbureau.gov.hk/cn/committees/mhrt.htm", destination: URL(string: "https://www.healthbureau.gov.hk/cn/committees/mhrt.htm")!).lineLimit(5).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center).foregroundColor(.black)
                
                HomeButton()
                HKULogo()
                
                
            }.padding(20)
        }.background(Image(.jackimage))
    }
    
}

struct H_aScreen_Previews: PreviewProvider {
    static var previews: some View {
        H_aScreen()
    }
}
