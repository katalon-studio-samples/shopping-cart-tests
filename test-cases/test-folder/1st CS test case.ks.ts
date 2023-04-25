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
    id: "da3329eb-5c8a-48ca-9ca6-e19de369ed6c",
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
        id: "e0c35b36-49da-4dc5-8290-70673ace3594",
        type: "CSS",
        value: "#txt-username",
        isDefault: true,
      },
      {
        id: "508e4658-5fd1-42b7-a5e1-80985cb8526a",
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
    id: "440813d2-ca66-4c5a-82f9-479c2db1f46a",
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
        id: "6a09c84b-204c-4cc8-b0b0-8d0363baa859",
        type: "CSS",
        value: "#txt-password",
        isDefault: true,
      },
      {
        id: "19198c80-c1fc-46eb-8f0c-bd244f5f1125",
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
    id: "cc12b9b3-e00f-49b2-bd96-b1722c053067",
    attributes: { id: "btn-login", type: "submit", class: "btn btn-default" },
    childIndex: 1,
    hashes: {},
    name: "button - Login",
    selectors: [
      {
        id: "72ef7667-e859-4ee1-9e68-bb208aa6bb03",
        type: "CSS",
        value: "#btn-login",
        isDefault: true,
      },
      {
        id: "998e21db-f5e2-4079-b20a-279effff0adc",
        type: "Attribute",
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "button",
    text: "Login",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/profile.php#login",
  });
  await web.closeBrowser();
});