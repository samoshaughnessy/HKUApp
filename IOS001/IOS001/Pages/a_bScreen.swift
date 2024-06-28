//
//  a_bScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 26/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//
import Foundation
import SwiftUI
import shared


struct A_bScreen: View {
var body: some View {
        ScrollView{
            VStack(alignment:.leading){
                Text("病人在有條件下獲釋放出院的命令摹本").lineLimit(2).font(Font.system(size: 35)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                // make image resizeable
                Image(.orderForConditionalDischarge).resizable().frame(width: 350, height: 500, alignment: .center)
                HStack{
                    BackButton(destination: {A_aScreen()})
                    NextButton(destination: { A_cScreen()})
                }
                HKULogo()
            }.padding(20)
        }.background(Image(.jackimage))
    }
    
}

struct A_bScreen_Previews: PreviewProvider {
    static var previews: some View {
        A_bScreen()
    }
}
