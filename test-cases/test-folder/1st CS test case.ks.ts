import katalon from "katalon";

export default katalon.testCase("New Test Case", async ({ local, web }) => {
  await new Promise((r) => setTimeout(r, 0));
  await web.openBrowser("https://katalon-demo-cura.herokuapp.com");
  await web.click({
    type: "Web",
    id: "57f01a42-17d9-4ca1-a48f-834f15c3b004",
    attributes: {
      id: "btn-make-appointment",
      href: "./profile.php#login",
      class: "btn btn-dark btn-lg",
    },
    childIndex: 4,
    hashes: {},
    name: "a - Make Appointment",
    selectors: [
      {
        id: "c110e951-0609-4d81-b0e5-1b4488578457",
        type: "CSS",
        value: "#btn-make-appointment",
        isDefault: true,
      },
      {
        id: "cfcd51f2-1b86-4785-8e47-3131b7361b7f",
        type: "Attribute",
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "a",
    text: "Make Appointment",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/",
  });
  await web.click({
    type: "Web",
    id: "c23794f5-4b8b-494a-b2c8-b08b6e11c59d",
    attributes: {
      type: "text",
      class: "form-control",
      id: "txt-username",
      name: "username",
      placeholder: "Username",
      value: "",
      autocomplete: "off",
    },
    childIndex: 1,
    hashes: {},
    name: "input - Username",
    selectors: [
      {
        id: "f6e79b28-f3a7-446f-afae-752bc4c30f22",
        type: "CSS",
        value: "#txt-username",
        isDefault: true,
      },
      {
        id: "c76009cb-25db-4da9-90dc-836bbd74894b",
        type: "Attribute",
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "input",
    text: "",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/profile.php#login",
  });
  await web.click({
    type: "Web",
    id: "6e958869-4868-4990-9035-3602de524b91",
    attributes: {
      type: "password",
      class: "form-control",
      id: "txt-password",
      name: "password",
      placeholder: "Password",
      value: "",
      autocomplete: "off",
    },
    childIndex: 1,
    hashes: {},
    name: "input - Password",
    selectors: [
      {
        id: "e15dc5b5-88a3-478e-9d84-c70dea4728ff",
        type: "CSS",
        value: "#txt-password",
        isDefault: true,
      },
      {
        id: "9900c394-603d-4fb6-af1a-92a42ee70ebc",
        type: "Attribute",
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "input",
    text: "",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/profile.php#login",
  });
  await web.closeBrowser();
});