import katalon from "katalon";

export default katalon.testCase("New Test Case", async ({ local, web }) => {
  await new Promise((r) => setTimeout(r, 0));
  await web.openBrowser("https://katalon-demo-cura.herokuapp.com");
  await web.click({
    type: "Web",
    id: "90fd0f4f-3c0a-472e-8620-87e9c9541eaf",
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
        id: "64c4958d-968a-45a7-bb38-888237306d79",
        type: "CSS",
        value: "#btn-make-appointment",
        isDefault: true,
      },
      {
        id: "d53bda6a-7d84-4488-b00a-d3d8027526af",
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
    id: "24540439-2b5e-41ff-9868-97068af5a9e6",
    attributes: {
      type: "text",
      class: "form-control",
      placeholder: "Username",
      "aria-describedby": "demo_username_label",
      value: "John Doe",
      readonly: "",
    },
    childIndex: 2,
    hashes: { "md5.v1": "d658d4e8da92fe56536b7b268fa72a89" },
    name: "input - Username",
    selectors: [
      {
        id: "b85dfe99-d21a-4085-bae1-f9ca766dea5b",
        type: "CSS",
        value: '[value="John\\ Doe"]',
        isDefault: true,
      },
      {
        id: "0d1200b2-6bab-4d09-99f4-bf1e2c3d4675",
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
    id: "21156791-6c34-4064-9c93-d5ea2f61262e",
    attributes: {
      type: "text",
      class: "form-control",
      placeholder: "Password",
      "aria-describedby": "demo_password_label",
      value: "ThisIsNotAPassword",
      readonly: "",
    },
    childIndex: 2,
    hashes: { "md5.v1": "f6711b02ce671cc2b817baf776140264" },
    name: "input - Password",
    selectors: [
      {
        id: "8f1beceb-9b02-4d6c-8353-6f4ab2af7164",
        type: "CSS",
        value: '[value="ThisIsNotAPassword"]',
        isDefault: true,
      },
      {
        id: "cd5d66ee-ca72-438d-b22f-5656aa6b714f",
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
    id: "90d1cdd2-ed29-43f5-9a94-7a177aeca804",
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
        id: "6fd5c7d6-cd55-462b-988d-4aa83b70fe14",
        type: "CSS",
        value: "#txt-username",
        isDefault: true,
      },
      {
        id: "813aab2f-a5b2-4552-9099-2f03bd42364d",
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
    id: "80d1b2a9-24bb-4e9b-acb1-820d887cd17a",
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
        id: "0ba4555d-45b3-4c5d-a786-0c95e1b5edbf",
        type: "CSS",
        value: "#txt-password",
        isDefault: true,
      },
      {
        id: "671f7c56-59c2-4d31-9073-9f3efaa29581",
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
    id: "422f0bda-6c05-4fc9-9657-d4835ee562c0",
    attributes: { id: "btn-login", type: "submit", class: "btn btn-default" },
    childIndex: 1,
    hashes: { "md5.v1": "50aa64147a00037c420def1e18673ac9" },
    name: "button - Login",
    selectors: [
      {
        id: "ebb93b85-f46e-448d-a502-c195dd411105",
        type: "CSS",
        value: "#btn-login",
        isDefault: true,
      },
      {
        id: "d71d8362-bfc4-463b-b21e-8b7303ec9fcd",
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
  await web.click({
    type: "Web",
    id: "3e2f3c03-b771-408c-92e8-c9424b1252ac",
    attributes: { class: "lead text-danger" },
    childIndex: 3,
    hashes: { "md5.v1": "e42406ae21f353ffa56e63d000e626ba" },
    name: "p - Login failed! Please ensure the username and password are valid.",
    selectors: [
      {
        id: "7d525726-183b-4586-adbb-ea4b3fc79b58",
        type: "CSS",
        value: ".lead.text-danger",
        isDefault: true,
      },
      {
        id: "dfab495d-aa99-45fd-a948-5c6fc817922d",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "p",
    text: "Login failed! Please ensure the username and password are valid.",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/profile.php#login",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.closeBrowser();
});