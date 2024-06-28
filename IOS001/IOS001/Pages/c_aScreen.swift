//
//  c_aScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 27/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared



struct C_aScreen: View {
    
    var body: some View {
        ScrollView{
            VStack(alignment:.leading){
                Text("您會被召回醫院嗎？\n").lineLimit(2).font(Font.system(size: 35)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Text("您仍有可能被召回醫院，如果院長認為您: \n").font(Font.system(size: 20)).fontWeight(.bold)
                
                Text(" -未能遵守施加的條件\n\n" +
                     "  -為了您的健康或安全，或者為了保護他人，有需要將您召回醫院\n") .font(Font.system(size: 20))
                
                Text(
                    "如果院長決定召回您，您會：").font(Font.system(size: 20)).fontWeight(.bold)
                
                Text("\n如何退出中途宿舍服務？\n").font(Font.system(size: 20)).fontWeight(/*@START_MENU_TOKEN@*/.bold/*@END_MENU_TOKEN@*/)
                
                Text("  -收到正式的書面通知\n\n" +
                     "   -在通知中規定的時間內需要自行回到醫院\n\n" + "-如果您在被召回後未有返回醫院，您可能會被扣押並被強制送回醫院" ).font(Font.system(size: 20))
                
                NextButton(destination: { C_bScreen()})
                
                HKULogo()
                
                
            }.padding(20)
        }.background(Image(.jackimage))
    }
}

struct C_aScreen_Previews: PreviewProvider {
    static var previews: some View {
        C_aScreen()
    }
}
