import { defineConfig } from 'astro/config';
import starlight from '@astrojs/starlight';

export default defineConfig({
    integrations: [
        starlight({
            title: 'aathu-lang',
            social: { github: 'https://github.com/aathoos/aathu-lang' },
            sidebar: [
                { label: 'Getting Started', items: [
                    { label: 'Installation', link: '/docs/installation' },
                    { label: 'Getting Started', link: '/docs/getting-started' },
                ]},
                { label: 'Tutorial', autogenerate: { directory: 'docs/tutorial' } },
                { label: 'Language Reference', autogenerate: { directory: 'docs/language-reference' } },
                { label: 'Standard Library', autogenerate: { directory: 'docs/stdlib-reference' } },
            ],
        }),
    ],
});
