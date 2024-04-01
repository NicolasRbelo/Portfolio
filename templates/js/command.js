let sections = document.querySelectorAll('section');
let LinksLocals = document.querySelectorAll('header nav a');


window.onscroll = () => {
    sections.forEach(sec =>{
        let top = window.scrollY;
        let offset = sec.offsetTop - 150;
        let height = sec.offsetHeight;
        let id = sec.getAttribute('id')

        if(top >= offset && top < offset + height) {
            LinksLocals.forEach(links => {
                links.classList.remove('ativo');
                document.querySelectorAll('header nav a[href*=' + id +']').classList.add('ativo');
            });
        };
    
    }) ;
        
};