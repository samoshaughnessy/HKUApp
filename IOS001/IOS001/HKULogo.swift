//
//  HKULogo.swift
//  IOS001
//
//  Created by Sam O'Shaughnessy on 26/6/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared


struct HKULogo: View {
    
    var body: some View {
        Image(.hkUlogo).padding(10)
    }
}

struct HKULogoPreview: PreviewProvider {
    static var previews: some View {
        HKULogo()
    }
}
