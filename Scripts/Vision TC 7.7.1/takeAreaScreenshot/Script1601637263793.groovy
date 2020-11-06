import org.openqa.selenium.Rectangle

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.google.com/')

WebUI.maximizeWindow()

WebUI.takeAreaScreenshot(RunConfiguration.getReportFolder() + '/image.png', new Rectangle(824, 89, 201, 272))

WebUI.takeScreenshot()

//WebUI.takeAreaScreenshot(new Rectangle(824, 89, 201, 272))
//
//WebUI.takeAreaScreenshot('D\\area.png', new Rectangle(824, 89, 201, 272))

WebUI.closeBrowser()