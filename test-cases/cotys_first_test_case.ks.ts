import katalon from "@katalon-studio/cloud-test";

export default katalon.testCase("New Test Case", async ({ local, web }) => {
  await new Promise((r) => setTimeout(r, 0));
  await web.openBrowser("https://katalon-demo-cura.herokuapp.com");
  await web.setText(
    {
      type: "Web",
      id: "ae87fc84-6d61-4b9f-8df8-9e653348fd1e",
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
          id: "e6994a59-f2fd-42dd-905f-0ca054f7ab61",
          type: "CSS",
          value: "#txt-username",
          isDefault: true,
        },
        {
          id: "d03b46bf-769d-4bd6-b729-7760f9f6e860",
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
    },
    "This is a test"
  );
  await web.setEncryptedText(
    {
      type: "Web",
      id: "16bc0ec8-8b81-4527-8437-924edd1d0533",
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
          id: "b1fe6e80-b78c-4744-85e3-15f5768f95f7",
          type: "CSS",
          value: "#txt-password",
          isDefault: true,
        },
        {
          id: "e88576c5-d9f6-4bdf-bd3e-ff534bb4bb70",
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
    },
    "b5fa37d676167366ef0c2e2f0e2c4efc-U2FsdGVkX1/SKqkhyfGS0nC5V2vpRNZpxPDlC/Rk+i4="
  );
});