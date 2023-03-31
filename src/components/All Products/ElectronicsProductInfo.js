import React from 'react';
import SingleProduct from '../SingleProduct';

const ElectronicsProductInfo =()=>{

    const Watch={
        productName:"Watch",
        price:"Rs 500",
        description: "Fossil Grant Chronograph Black Dial Men's Watch-FS4832 | Band Color: Black: Band Material: Stainless Steel| Dial Color: Black, Case Shape: Round, Dial Glass Material: Mineral. Closure: Single Press Deployant | Case Material: Stainless Steel, Case Diameter: 44 millimeters. Strap Inner Circumference: 200+/- 5MM ",
        mainImage:"https://m.media-amazon.com/images/I/51f0gIYCcSL._UX425_.jpg",
        img1:"https://m.media-amazon.com/images/I/41wwxQyu69L._AC_SR320,320_.jpg",
        img2:"https://m.media-amazon.com/images/I/418RokHXdmL._AC_SR320,320_.jpg",
        img3:"https://images-eu.ssl-images-amazon.com/images/I/61lk-YxTUAL._AC_UL116_SR116,116_.jpg",
        img4:"https://m.media-amazon.com/images/I/61-CiRLFhqL._AC_SS450_.jpg",
    }

    const TV={
        productName:"TV",
        price:"Rs 30,000 ",
        description:"Sony Bravia 126 cm (50 inches) 4K Ultra HD Smart LED Google TV KD-50X74K (Black) | Resolution: 4K Ultra HD (3840 x 2160) | Refresh Rate: 60 Hertz | 178 Degree wide viewing angle, Connectivity: 3 HDMI ports to connect set top box, Blu Ray players, gaming console | 2 USB ports to connect hard drives and other USB devices.",
        mainImage:"https://m.media-amazon.com/images/S/al-eu-726f4d26-7fdb/8ce23388-2432-4b86-9119-8d0e8a9e3895._CR0,0,1200,628_SX460_QL70_.jpg",
        img1:"https://m.media-amazon.com/images/I/81wxS8abrgL._AC_UY218_.jpg",
        img2:"https://m.media-amazon.com/images/I/71a4ZQNqTiL._AC_UY218_.jpg",
        img3:"https://m.media-amazon.com/images/I/81Itairz1YL._AC_UY218_.jpg",
        img4:"https://m.media-amazon.com/images/I/71arAQvySlL._AC_UY218_.jpg",
    }

    const Mobile={
        productName:"Mobile",
        price:"Rs 15,000",
        description:"OnePlus Nord CE 2 Lite 5G (Black Dusk, 6GB RAM, 128GB Storage) | Camera Features: AI scene enhancement, Dual-View Video, HDR, Night Portrait, Panorama Mode, Retouch Filters, 1080p video at 30 fps, SLO-MO: 720p video at 120 fps, TIME-LAPSE: 1080p video at 30 fps, Video editor, Face unlock, Screen flash, HDR, NIGHT, PORTRAIT, TIME-LAPSE, Retouch, Filters",
        mainImage:"https://m.media-amazon.com/images/I/71V--WZVUIL._SX679_.jpg",
        img1:"https://m.media-amazon.com/images/I/81t6Av5DvXL._AC_UY218_.jpg",
        img2:"https://m.media-amazon.com/images/I/41f-Bpb9dLL._AC_SR320,320_.jpg",
        img3:"https://m.media-amazon.com/images/I/41oqY6WXjrL._AC_SR320,320_.jpg",
        img4:"https://m.media-amazon.com/images/I/61Nj45fl+XL._AC_UY218_.jpg",
    }

    const Printer={
        productName:"Printer",
        price:"Rs 12,099",
        description:"Canon PIXMA G2012 Printer Mono/Colour, Print, Scan,Copy, High Volume Printing, 3.04 LCD Screen, 2 Additional Black Ink Bottles | Printer type: Inktank ; Functions: Print, Scan, Copy ; Printer output: Colour ; Connectivity: USB ; Scanner: Yes ; Scanner resolution: 600 x1200 dpi| Special Features: Borderless Printing, High volume printing",
        mainImage:"https://m.media-amazon.com/images/I/51SksJs2bqL._AC_UY218_.jpg",
        img1:"https://m.media-amazon.com/images/I/318+tdVWmuL._AC_SR320,320_.jpg",
        img2:"https://m.media-amazon.com/images/I/41Lb8sFaFhL._AC_SR320,320_.jpg",
        img3:"https://m.media-amazon.com/images/I/61bLISKr1EL._AC_UY218_.jpg",
        img4:"https://m.media-amazon.com/images/I/61BZXvFYnQL._AC_UY218_.jpg",
    }

    const Earphones={
        productName:"Earphones",
        price:"Rs 2000",
        description:"Boult Audio Z20 True Wireless in Ear Earbuds with Zen ENC Mic, 40H Playtime, Type-C Fast Charging, Made in India, 10mm Rich Bass Drivers, Environmental Noise Cancellation, IPX5 Ear Buds TWS (Green) | Touch Controls & Voice Assistant: With one multifunction button, you can play/pause, previous/next track and answer/hang-up calls. Voice assistant function lets you access Siri/Google Assistant.",
        mainImage:"https://m.media-amazon.com/images/I/71GFeaOKepL._AC_UY218_.jpg",
        img1:"https://m.media-amazon.com/images/I/51yB+3-eJwL._AC_UY218_.jpg",
        img2:"https://m.media-amazon.com/images/I/51UhwaQXCpL._AC_UY218_.jpg",
        img3:"https://m.media-amazon.com/images/I/51yXYxvskaL._AC_UL320_.jpg",
        img4:"https://m.media-amazon.com/images/I/61l+14s5QVL._AC_UY218_.jpg",
    }

    const Charger={
        productName:"Charger",
        price:"Rs 700",
        description:"Amazon Basics High Power 65W Mobile/Laptop Charger Dual Port Output with Type-C Charging Cable (Black)| The Amazon Basics charger is compatible with devices like headphones, fitness bands, smartphones, laptops, and more.| It comes with 2 Type-C port and 1 Type-A port which can charge multiple devices simultaneously",
        mainImage:"https://m.media-amazon.com/images/I/31BHy+8YBNL._AC_SR320,320_.jpg",
        img1:"https://m.media-amazon.com/images/I/61ODfXHV7tL._SX569_.jpg",
        img2:"https://m.media-amazon.com/images/I/31hS50gmaiL._AC_SR320,320_.jpg",
        img3:"https://m.media-amazon.com/images/I/51w2HcialIL._AC_UY218_.jpg",
        img4:"https://m.media-amazon.com/images/I/41JnZRv9qQL._AC_UY218_.jpg",
    }

    const Laptop={
        productName:"Laptop",
        price:"Rs 60,000",
        description:"Lenovo IdeaPad Slim 5 Intel Core i5 11th Gen 15.6 (39.62cm) FHD IPS Thin & Light Laptop (16GB/512GB SSD/Windows 11/Office 2021/Backlit/FPR/3months Game Pass/Graphite Grey/1.66Kg), 82FG01B5IN | Processor: 11th Gen Intel Tiger Lake Core i5-1135G7 | Speed: 2.4 GHz (Base) - 4.2 GHz (Max) | 4 Cores | 8MB Cache",
        mainImage:"https://m.media-amazon.com/images/I/61WNxdAeAoL._SX425_.jpg",
        img1:"https://m.media-amazon.com/images/I/41wckRIRRXL._AC_SR320,320_.jpg",
        img2:"https://m.media-amazon.com/images/I/91cf-YwsuXL._AC_UY218_.jpg",
        img3:"https://m.media-amazon.com/images/I/61Dw5Z8LzJL._AC_UY218_.jpg",
        img4:"https://m.media-amazon.com/images/I/61Ph34V0YAL._AC_UY218_.jpg",
    }

    // const Watch={
    //     productName:"",
    //     price:"Rs ",
    //     description:"",
    //     mainImage:"",
    //     img1:"",
    //     img2:"",
    //     img3:"",
    //     img4:"",
    // }

    // const Watch={
    //     productName:"",
    //     price:"Rs ",
    //     description:"",
    //     mainImage:"",
    //     img1:"",
    //     img2:"",
    //     img3:"",
    //     img4:"",
    // }

    // const Watch={
    //     productName:"",
    //     price:"Rs ",
    //     description:"",
    //     mainImage:"",
    //     img1:"",
    //     img2:"",
    //     img3:"",
    //     img4:"",
    // }

    // const Watch={
    //     productName:"",
    //     price:"Rs ",
    //     description:"",
    //     mainImage:"",
    //     img1:"",
    //     img2:"",
    //     img3:"",
    //     img4:"",
    // }

    // const Watch={
    //     productName:"",
    //     price:"Rs ",
    //     description:"",
    //     mainImage:"",
    //     img1:"",
    //     img2:"",
    //     img3:"",
    //     img4:"",
    // }

    // const Watch={
    //     productName:"",
    //     price:"Rs ",
    //     description:"",
    //     mainImage:"",
    //     img1:"",
    //     img2:"",
    //     img3:"",
    //     img4:"",
    // }

    // const Watch={
    //     productName:"",
    //     price:"Rs ",
    //     description:"",
    //     mainImage:"",
    //     img1:"",
    //     img2:"",
    //     img3:"",
    //     img4:"",
    // }

    // const Watch={
    //     productName:"",
    //     price:"Rs ",
    //     description:"",
    //     mainImage:"",
    //     img1:"",
    //     img2:"",
    //     img3:"",
    //     img4:"",
    // }

    return (
        <>
        <SingleProduct Info={Watch}/> 
        <SingleProduct Info={TV}/> 
        <SingleProduct Info={Mobile}/> 
        <SingleProduct Info={Printer}/> 
        <SingleProduct Info={Earphones}/> 
        <SingleProduct Info={Charger}/> 
        <SingleProduct Info={Laptop}/> 
        <SingleProduct Info={Watch}/> 
        <SingleProduct Info={Watch}/> 
        <SingleProduct Info={Watch}/> 
        <SingleProduct Info={Watch}/> 
        <SingleProduct Info={Watch}/> 
        <SingleProduct Info={Watch}/> 
        <SingleProduct Info={Watch}/> 
        <SingleProduct Info={Watch}/>   
        </>
    )
}

export default ElectronicsProductInfo;