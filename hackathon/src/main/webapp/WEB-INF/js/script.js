function getOffers(request) {
    let clientId = "06793e7963b44e35bae13f287da40b4d";
    let token = "nso5XoiSuFE1AhykVJrtetRiKQY6ayaqGWMEvtm9GubrDmXtwfqyRuKv6IQnsBfx";
    $.ajax({
        url: "https://api.allegro.pl/offers/listing?phrase" + request,
        username: clientId,
        password: token,
        contentType: "json",
        type: "GET",
        success: function() { console.log("success"); },
        error: function() { console.log("error"); }
    });
}