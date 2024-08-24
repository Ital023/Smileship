/** @type {import('tailwindcss').Config} */
const withMT = require("@material-tailwind/react/utils/withMT");

module.exports = withMT({
  content: [
    "./index.html",
    "./src/**/*.{js,ts,jsx,tsx}",
    "./node_modules/@material-tailwind/react/components/**/*.{js,ts,jsx,tsx}",
    "./node_modules/@material-tailwind/react/theme/components/**/*.{js,ts,jsx,tsx}"
  ],
  theme: {
    extend: {
      colors: {
        'primary-color-bg': '#000000',
        'secondary-color-bg': '#1B1F23',
        'tertiary-color-bg': '#18181B',

        'primary-color-txt': '#FFD700',
        'secondary-color-txt': '#FFFFFF',
      },
      fontFamily: {
        righteous: ['Righteous', 'sans-serif'],
        OpenSans:['Open Sans', 'sans-serif']
      }
    },
  },
  plugins: [],
})

