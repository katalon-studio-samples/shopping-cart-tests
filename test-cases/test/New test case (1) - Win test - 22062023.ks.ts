import katalon from "@katalon-studio/cloud-test";

export default katalon.testCase("New Test Case", async ({ local, web }) => {
  await new Promise((r) => setTimeout(r, 0));
  await web.openBrowser("https://katalon-demo-cura.herokuapp.com");
  await web.click({
    type: "Web",
    id: "d761c23a-1e26-42fc-a505-25dfe2fcfbab",
    attributes: {
      id: "btn-make-appointment",
      href: "./profile.php#login",
      class: "btn btn-dark btn-lg",
    },
    childIndex: 4,
    hashes: { "md5.v1": "3caec008087ccb7a1cb3fc698fbf83c2" },
    name: "a - Make Appointment",
    selectors: [
      {
        id: "a9086300-052a-40ba-b2bc-0d1dc4569152",
        type: "CSS",
        value: "#btn-make-appointment",
        isDefault: true,
      },
      {
        id: "c70d8560-a3d0-422f-839e-dbe9420383c0",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "a",
    text: "Make Appointment",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.click({
    type: "Web",
    id: "29dfb632-87e1-4512-8679-204310963a14",
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
    hashes: { "md5.v1": "fe634c654141065106a978262a410740" },
    name: "input - Password",
    selectors: [
      {
        id: "4e3624a0-ab8a-43d7-a3e0-92dd34fcfb6e",
        type: "CSS",
        value: "#txt-password",
        isDefault: true,
      },
      {
        id: "dc3815ec-0d15-43e5-a324-2eb6106bc112",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "input",
    text: "",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/profile.php#login",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.click({
    type: "Web",
    id: "0b45f73e-0e29-4eb9-ae3c-dde66671c504",
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
    hashes: { "md5.v1": "57f176ba19cb19cc93acaba2dbde6b10" },
    name: "input - Username",
    selectors: [
      {
        id: "0c03a4e8-cca4-4373-8518-e882ccc679b2",
        type: "CSS",
        value: "#txt-username",
        isDefault: true,
      },
      {
        id: "88968552-ccd3-4c30-ad3d-a1db0089ad9f",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "input",
    text: "",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/profile.php#login",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.click({
    type: "Web",
    id: "ee198f86-2ecb-460b-b5c4-59c88c4112d3",
    attributes: { class: "col-sm-offset-4 col-sm-8" },
    childIndex: 1,
    hashes: { "md5.v1": "ac1076e411321cb8c6238b602dc4f7c5" },
    name: "div - Login",
    selectors: [
      {
        id: "6e95b918-42bc-4c9c-a86d-c86d21f9e038",
        type: "CSS",
        value: ".form-group:nth-child(4) div",
        isDefault: true,
      },
      {
        id: "80ac5005-cd40-428e-9da1-03c1256f5bed",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "div",
    text: "Login",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/profile.php#login",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.click({
    type: "Web",
    id: "84552562-0811-4531-83ce-9118ef36571f",
    attributes: { id: "btn-login", type: "submit", class: "btn btn-default" },
    childIndex: 1,
    hashes: { "md5.v1": "50aa64147a00037c420def1e18673ac9" },
    name: "button - Login",
    selectors: [
      {
        id: "1b1a1be7-81ad-47af-a5f9-70cbe42db5af",
        type: "CSS",
        value: "#btn-login",
        isDefault: true,
      },
      {
        id: "5872bab7-d6ba-42f4-b253-243c4a5e174e",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "button",
    text: "Login",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/profile.php#login",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.closeBrowser();
});