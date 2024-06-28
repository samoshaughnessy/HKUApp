//
//  b_aScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 26/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared


struct B_aScreen: View {
    
    var body: some View {
        
        ScrollView {
            
            VStack(alignment:.leading){
                Text("什麼是中途宿舍?").lineLimit(2).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Text("\n-為有條件釋放者提供的指定住所，提供膳食服務\n\n" +
                     "-提供個人輔導及小組/社區活動\n\n" +
                     "-週末及節假日可以請假\n\n" +
                     "-經登記，家人和朋友可以來訪\n\n" +
                     "-居住期限根據個人需要和進度，由院長決定").font(Font.system(size: 20))
                // make image resizeable
                HStack{
                    Spacer()
                    Spacer()
                    Image(.house).resizable().frame(width: 150, height: 150)}
                
                NextButton(destination: { B_bScreen()})
                
                HKULogo()
            }.padding(20)
            
        }.background(Image(.jackimage))
    }
    
}

struct B_aScreen_Previews: PreviewProvider {
    static var previews: some View {
        B_aScreen()
    }
}
