# Uller Backend
The Ulla backend manages Android client subscriptions and sends the appropriate notifications when the corresponding product is available.
In addition, the backend determines the availability of the stored products via web scraping. 

#### Other Uller repos 
- See the [Uller Android App](https://github.com/grundhofer/uller-android) repo for receiving notifications.
- See the [Uller Web App](https://github.com/grundhofer/uller-dashboard-flutter_web) repo for testing the notfication service.

#### Prerequisites:
- Uller Web App + Uller Android App
- Add [service-account-file.json](https://firebase.google.com/docs/admin/setup?authuser=0#linux-or-macos) for Firebase Cloud Messaging

#### Technologies:
- Ktor
- Firebase Cloud Messaging
