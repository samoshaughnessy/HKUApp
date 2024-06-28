//
//  Menus.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 27/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared


struct HomeScreen: View {
    
    var body: some View {
                    ViewThatFits{
                    VStack(alignment:.leading){
                        HStack{
                            NavigationLink(destination: A_aScreen()){
                                VStack{
                                    Image(._1Door).resizable().frame(width:100, height:100)
                                    Text("有條件釋放").foregroundColor(.black)
                                }
                            }.frame(width: 150, height:150)
                            
                            NavigationLink(destination: B_aScreen()){
                                VStack{
                                    Image(._2House).resizable().frame(width:100, height:100)
                                    Text("中途宿舍").foregroundColor(.black)
                                }
                            }.frame(width: 150, height:150)
                        }
                        
                        HStack {
                            NavigationLink(destination: C_aScreen()){
                                VStack{
                                    Image(._3Clipboard).resizable().frame(width:100, height:100)
                                    Text("您會被召回醫院嗎？").foregroundColor(.black)
                                }
                            }.frame(width: 150, height:150)
                            
                            NavigationLink(destination: D_aScreen()){
                                VStack{
                                    Image(._4Scales).resizable().frame(width:100, height:100)
                                    Text("如果有條件釋放令不合理？").foregroundColor(.black)
                                }
                            }.frame(width: 150, height:150)
                            
                        }
                        
                        HStack {
                            NavigationLink(destination: E_aScreen()){
                                VStack{
                                    Image(._5Docs).resizable().frame(width:100, height:100)
                                    Text("復核申請需要哪些資料？").foregroundColor(.black)
                                }
                                
                            }.frame(width: 150, height:150)
                            
                            NavigationLink(destination: F_aScreen()){
                                VStack{
                                    Image(._6Doctor).resizable().frame(width:100, height:100)
                                    Text("可以向你的醫生提出的問題").foregroundColor(.black)
                                }
                            }.frame(width: 150, height:150)
                            
                        }
                        
                        HStack {
                            NavigationLink(destination: G_aScreen()){
                                VStack{
                                    Image(._7Stats).resizable().frame(width:100, height:100)
                                    Text("有條件釋放令統計").foregroundColor(.black)
                                }
                            }.frame(width: 150, height:150)
                            
                            NavigationLink(destination: H_aScreen()){
                                VStack{
                                    Image(._8Contact).resizable().frame(width:100, height:100)
                                    Text("重要聯絡人").foregroundColor(.black)
                                }
                            }.frame(width: 150, height:150)
                        }
                        
                        HKULogo()
                    }
                    
                }.padding(20).background(Color.clear).background(Image(.jackimage))
    }
}

struct HomeScreen_Previews: PreviewProvider {
    static var previews: some View {
        HomeScreen()
    }
}
