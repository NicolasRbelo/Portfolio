/*====================== scroll sections active link ==============*/
let IconeMenu = document.querySelector('#icone-menu')
let BarraNav = document.querySelector('.barraNav')

IconeMenu.onclick = () => {
  IconeMenu.classList.toggle('bx-x');
  BarraNav.classList.toggle('ativo');
};

/*====================== Troca de seção Ativa ==============*/
let sections = document.querySelectorAll('section');
let navLinks = document.querySelectorAll('header nav a');

window.onscroll = () => {
  sections.forEach(sec => {
    let topo = window.scrollY;
    let Defora = sec.offsetTop - 150;
    let Altura = sec.offsetHeight;
    let id = sec.getAttribute('id');

    if(topo >= Defora && topo < Defora + Altura) {
      navLinks.forEach(links => {
        links.classList.remove('ativo');
        document.querySelector('header nav a[href*=' + id + ']').classList.add('ativo');
      });
    } 
  });
  /*==================================================*/

    let cabecario = document.querySelector('header')
    

    cabecario.classList.toggle('loginho', window.scrollY > 100)
  /*====================== Menu fecha ao trocar de seção  ==============*/

  IconeMenu.classList.remove('bx-x');
  BarraNav.classList.remove('ativo');

  
  };

