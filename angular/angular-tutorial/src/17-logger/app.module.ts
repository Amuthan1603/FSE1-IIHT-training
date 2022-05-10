import { HttpClientModule } from "@angular/common/http";
import { NgModule } from "@angular/core";
import { ReactiveFormsModule } from "@angular/forms";
import { BrowserModule } from "@angular/platform-browser";
import { LoggerModule, NgxLoggerLevel } from "ngx-logger";
import { AppComponent } from "./app.component";

@NgModule({
    declarations: [AppComponent],
    imports: [
        BrowserModule,
        HttpClientModule,
        ReactiveFormsModule,
        LoggerModule.forRoot({
            level: NgxLoggerLevel.DEBUG,
            serverLogLevel: NgxLoggerLevel.ERROR,
            serverLoggingUrl: "http://localhost:3000/errors",
            colorScheme: ['purple', 'teal', 'gray', 'gray', 'red', 'red', 'red']
        })
    ],
    bootstrap: [AppComponent]
})
export class AppModule { }