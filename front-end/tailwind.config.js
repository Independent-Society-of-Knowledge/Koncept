/** @type {import('tailwindcss').Config} */
export default {
    content: [
        "./components/**/*.{vue,js,ts}",
        "./layouts/**/*.vue",
        "./pages/**/*.vue",
        "./plugins/**/*.{js,ts}",
        "./app.vue",
        "./error.vue"
    ],
    theme: {
        extend: {},
        fontFamily: {
            'ibm-plex-mono': ['IBM Plex Mono', 'monospace'],
            'ibm-plex-sans': ['IBM Plex Sans', 'sans-serif'],
            'ibm-plex-sans-condensed': ['IBM Plex Sans Condensed', 'sans-serif'],
            'ibm-plex-serif': ['IBM Plex Serif', 'serif'],
        },
        colors: {
            'isk-100': '#CCC8D8',
            'isk-200': '#9B91B0',
            'isk-300': '#503E75',
            'isk-400': '#3E2966',
            'isk-500': '#2E204B',
            'isk-600': '#251D35',
            'isk-blue-100': '#89A8BF',
            'isk-blue-200': '#2F678F',
            'isk-blue-300': '#11517E',
            'isk-blue-400': '#193A56',
            'isk-blue-500': '#1D2F42',
            'isk-blue-600': '#1F2938',
            'isk-gray-100': '#F9F9F9',
            'isk-gray-200': '#E4E4E4',
            'isk-gray-300': '#575658',
            'isk-gray-400': '#2D2C2E',
            'isk-gray-500': '#1D1C1D',
            'isk-gray-600': '#151415',
            'isk-red-100': '#D77B7B',
            'isk-red-200': '#CB5656',
            'isk-red-300': '#BA2424',
            'isk-yellow-100': '#FFEFC0',
            'isk-yellow-200': '#FFD760',
            'isk-yellow-300': '#FFBF00',
            'isk-green-100': '#B5D7BB',
            'isk-green-200': '#90C399',
            'isk-green-300': '#6BAE76',
            'isk-green-400': '#4E905A',
        },
        spacing: {
            '1': '0.125rem', // 2px
            '2': '0.25rem', // 4px
            '3': '0.5rem', // 8px
            '4': '0.75rem', // 12px
            '5': '1rem', // 16px
            '6': '1.5rem', // 24px
            '7': '2rem', // 32px
            '8': '2.5rem', // 40px
            '9': '3rem', // 48px
            '10': '4rem', // 64px
            '11': '5rem', // 80px
            '12': '6rem', // 96px
            '13': '10rem', // 160px
        }
    },
    plugins: [],
}

