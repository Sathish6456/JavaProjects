JWT
Json Web Token 
	header.payload.signature
	
	header-Algorithm used for token generation 

	payload-additional information while generating the token (username,roles)

	signature-private sensitive String value which validates thin token 
		(This string ONLY on server not shared with client)
		(This string should be very complext so that it can't be guessed)


Json web token

eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.													-header
eyJ1c2Vybm5hbWUiOiJ6ZW5zYXIiLCJleHAiOjE2NDc5MjcyMzJ9.									-payload
MjYNQuGsAitZf4X860pVLJ_1CHLVfttjj8Ewhd0So_lvRidWic9gkAZ14p59_mZXt_DkUzxgXHGrPNiC2VT6nw	-signature

.withExpiresAt(new Date(System.currentTimeMillis() + 10*60*60)) //by using this we can set some time for the web token

we can store our token in Browser SessionStorage by using - SessionStorage.getItem('token')

if we clear the cache of our browser passwords will be cleaned or removed from our Browser 
