import katalon from "katalon";

export default katalon.testCase("New Test Case", async ({ local, web }) => {
  await web.openBrowser("https://katalon-demo-cura.herokuapp.com");
  await web.closeBrowser();
});