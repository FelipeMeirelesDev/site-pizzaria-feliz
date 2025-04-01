gsap.registerPlugin(ScrollTrigger)

gsap.fromTo('.s-heroInfos', {
    x: -1000,
    opacity: 0,
    rotate: -90,
}, {
    x: 0, 
    opacity: 1,
    rotate: 0,
    stagger: 1,
    duration: 2, 
    ease: "power2.out" 
})

gsap.fromTo('.s-heroVideo', {
    x: 1000,
    opacity: 0,
    rotate: -90
}, {
    x: 0, 
    opacity: 1,
    rotate: 0,
    stagger: 1,
    duration: 3, 
    ease: "power2.out" 
})

gsap.fromTo('.forms-entrega', {
    x: -1000,
    opacity: 0,
    rotate: -90,
}, {
    x: 0, 
    opacity: 1,
    rotate: 0,
    stagger: 1,
    duration: 2, 
    ease: "power2.out" 
})