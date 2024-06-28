//
//  b_bScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 26/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared



struct B_bScreen: View {    
    var body: some View {
        ScrollView{
            VStack(alignment:.leading){
                Text("香港中途宿舍位置\n").lineLimit(2).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Text("點擊下面的鏈接查看香港所有中途宿舍的完整列表。該列表包括地址和重要的聯絡信息。").font(Font.system(size: 20)).frame(maxWidth: .infinity, alignment: .leading)
                
                
                Link("點擊這裡", destination: URL(string: "https://www.swd.gov.hk/storage/asset/section/675/tc/HWH_Aug_2022.pdf")!).lineLimit(5).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
               
                
                HStack{
                    BackButton(destination: { B_aScreen()})
                    NextButton(destination: { B_cScreen()})
                }
                
                HKULogo()
                
                
            }.padding(20)
        }.background(Image(.jackimage))
    }
    
}

struct B_bScreen_Previews: PreviewProvider {
    static var previews: some View {
        B_bScreen()
    }
}
