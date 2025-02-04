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
    @State private var currentZoom = 0.0
     @State private var totalZoom = 1.0
    @State var magScale: CGFloat = 1
    @State var progressingScale: CGFloat = 1
    
    var magnification: some Gesture {
            MagnificationGesture()
                .onChanged { progressingScale = $0 }
                .onEnded {
                    magScale *= $0
                    progressingScale = 1
                }
        }
    
var body: some View {
    ScrollView{
        VStack(alignment:.leading){
            HStack{
                NavigationLink(destination: BurgerMenu()){
                    Image(systemName: "line.3.horizontal").resizable().frame(width: 30, height: 30).foregroundColor(.black)
                }.frame(width: 50)
                Spacer()
                Text("病人在有條件下獲釋放出院的命令摹本 ▼").lineLimit(3).font(Font.system(size: 25)).fontWeight(.bold).frame(maxWidth: .infinity).multilineTextAlignment(.center).foregroundColor(.black).onTapGesture {
                    
                    tapped = !tapped
                }
                Spacer()
            }
            if tapped {
                VStack{
                    Divider()
                    LinkingButton(destination: { A_aScreen()}, text: "\n什麼是有條件釋放？")
                    Divider()
                    LinkingButton(destination: { A_bScreen()}, text: "病人在有條件下獲釋放出院的命令摹本")
                    Divider()
                    LinkingButton(destination: { A_cScreen()}, text: "什麼是“條件”？")
                    
                }.onTapGesture {
                    tapped = false
                }
            }
            
            Divider()
            Text("\n病人在有條件下獲釋放出院的命令摹本").lineLimit(4).font(Font.system(size: 30)).fontWeight(.bold).frame(maxWidth: .infinity).multilineTextAlignment(.center)
            
            // make image resizeable
            if #available(iOS 17.0, *) {
                Image(.orderForConditionalDischarge).resizable().frame(width: 350, height: 500, alignment: .center).scaleEffect(currentZoom + totalZoom)
                    .gesture(
                        MagnifyGesture()
                            .onChanged { value in
                                currentZoom = value.magnification - 1
                            }
                            .onEnded { value in
                                totalZoom += currentZoom
                                currentZoom = 0
                            }
                    )
                    .accessibilityZoomAction { action in
                        if action.direction == .zoomIn {
                            totalZoom += 1
                        } else {
                            totalZoom -= 1
                        }
                    }
            } else {
                Image(.orderForConditionalDischarge).resizable().frame(width: 350, height: 500, alignment: .center).scaleEffect(self.magScale * progressingScale)
                    .gesture(magnification)

            }
                HStack{
                    BackButton(destination: {A_aScreen()})
                    NextButton(destination: { A_cScreen()})
                }
                HKULogo()
            }.padding(20).border(Color.gray, width:3).padding(10)
        }.background(Image(.jackimage))
    }
    
}

struct A_bScreen_Previews: PreviewProvider {
    static var previews: some View {
        A_bScreen()
    }
}
