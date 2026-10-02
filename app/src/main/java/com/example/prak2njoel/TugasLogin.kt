package com.example.prak2njoel

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    val bgImage = painterResource(id = R.drawable.background)
    
    // 1. Gambar Profil Bawah
    val profileImage = painterResource(id = R.drawable.profilku)

    // 2. Gambar Putih Atas / Logo (Toplogo)
    val topLogoImage = painterResource(id = R.drawable.toplogo)

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Background image edge-to-edge
        Image(
            painter = bgImage,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Darker overlay for contrast
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.6f))
        )

        // Menggunakan Arrangement.spacedBy dengan jarak konsisten agar rapi dan tidak terlalu renggang
        Column(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding()
                .padding(horizontal = 24.dp, vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.Top)
        ) {
            // Header: Login & Subtitle
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Login",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF42A5F5)
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "Ini adalah halaman login,",
                    fontSize = 13.sp,
                    color = Color.LightGray
                )
            }

            // Logo / Gambar Putih Atas (Toplogo)
            Box(
                modifier = Modifier
                    .size(105.dp)
                    .clip(CircleShape)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = topLogoImage,
                    contentDescription = "Logo Atas",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }

            // User Info: Nama & NIM
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Nama",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFF5252)
                )
                Spacer(modifier = Modifier.height(1.dp))
                Text(
                    text = "Muhammad Rizki Zulfauzi",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF64B5F6)
                )
                Spacer(modifier = Modifier.height(1.dp))
                Text(
                    text = "20240140039",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }

            // Spacer khusus untuk mengatur jarak turun foto profil tanpa membuat elemen atas renggang
            Spacer(modifier = Modifier.height(12.dp))

            // Bottom Circular Profile Image (Besar dan rapi di bawah)
            Box(
                modifier = Modifier
                    .size(170.dp)
                    .clip(CircleShape)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = profileImage,
                    contentDescription = "Foto Profil",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}
