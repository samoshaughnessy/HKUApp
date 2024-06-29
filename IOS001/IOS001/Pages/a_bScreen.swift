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
    @State    var tapped = false
var body: some View {
        ScrollView{
            VStack(alignment:.leading){
                HStack{
                    NavigationLink(destination: BurgerMenu()){
                        Image(systemName: "line.3.horizontal").resizable().frame(width: 30, height: 30).foregroundColor(.black)
                }.frame(width: 50)
                    Spacer()
                    Text("病人在有條件下獲釋放出院的命令摹本").lineLimit(3).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity).multilineTextAlignment(.center).foregroundColor(.white).onTapGesture {
          
                        tapped = !tapped
                        }
                    Spacer()
                }
                if tapped {
                    VStack{
                        Divider()
                        LinkingButton(destination: { A_aScreen()}, text: "\n什麼是有條件釋放？ ▼")
                        Divider()
                        LinkingButton(destination: { A_bScreen()}, text: "病人在有條件下獲釋放出院的命令摹本 ▼")
                        Divider()
                        LinkingButton(destination: { A_cScreen()}, text: "什麼是“條件”？ ▼")

                    }.onTapGesture {
                        tapped = false
                    }
                }
                
                Divider()
                Text("\n病人在有條件下獲釋放出院的命令摹本").lineLimit(4).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity).multilineTextAlignment(.center)
                
                // make image resizeable
                Image(.orderForConditionalDischarge).resizable().frame(width: 350, height: 500, alignment: .center)
                HStack{
                    BackButton(destination: {A_aScreen()})
                    NextButton(destination: { A_cScreen()})
                }
                HKULogo()
            }.padding(20).background(Color.gray).border(Color.gray, width:3).opacity(0.8).padding(10)
        }.background(Image(.jackimage))
    }
    
}

struct A_bScreen_Previews: PreviewProvider {
    static var previews: some View {
        A_bScreen()
    }
}
