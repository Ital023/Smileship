/** @type {import('tailwindcss').Config} */
export default {
  content: [
    "./index.html",
    "./src/**/*.{js,ts,jsx,tsx}",
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
        righteous: ['Righteous', 'sans-serif']
      },
      spacing: {
        '128': '32rem',
        '364': '42rem',

      }
    },
  },
  plugins: [],
}

