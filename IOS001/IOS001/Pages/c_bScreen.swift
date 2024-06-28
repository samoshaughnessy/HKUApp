//
//  c_bScreen.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 27/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared



struct C_bScreen: View {
        
    var body: some View {
        ScrollView{
            VStack(alignment:.leading){
                Text("有條件釋放令召回\n").lineLimit(2).font(Font.system(size: 35)).fontWeight(.bold).frame(maxWidth: .infinity, alignment: .center)
                
                Text("再次入院後，有條件釋放令還有效嗎？\n").font(Font.system(size: 20)).fontWeight(.bold)
                
                Text("-如果您被強制重新送進醫院，原有的有條件釋放令將不再有效。當您被釋放時，院長可能會發佈新的有條件釋放令；\n \n" +
                     "-如果您非正式地重新入院（對於非正式的界定，每個醫院的要求不同，建議您向所在醫院詢問清楚）或自願入院，或入住醫院的非精神科病房，有條件釋放令仍然有效；") .font(Font.system(size: 20))
                
                
                HStack{
                    BackButton(destination: {C_aScreen()})
                    NextButton(destination: { C_cScreen()})
                }
                
                HKULogo()
                
                
            }.padding(20)
        }.background(Image(.jackimage))
    }
    
}

struct C_bScreen_Previews: PreviewProvider {
    static var previews: some View {
        C_bScreen()
    }
}
