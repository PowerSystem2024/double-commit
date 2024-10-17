<script lang="js" setup></script>

<template>
  <section class="marquee">
    <p>
      PORTFOLIO WEB · PORTFOLIO WEB · PORTFOLIO WEB · PORTFOLIO WEB · PORTFOLIO WEB · PORTFOLIO WEB
      · PORTFOLIO WEB · PORTFOLIO WEB · PORTFOLIO WEB · PORTFOLIO WEB · PORTFOLIO WEB · PORTFOLIO
      WEB ·
    </p>
    <div class="reverse">
      <h3>
        DOUBLE COMMIT 2024 ▪ DOUBLE COMMIT 2024 ▪ DOUBLE COMMIT 2024 ▪ DOUBLE COMMIT 2024 ▪
        DOUBLE COMMIT 2024 ▪
      </h3>
    </div>
    <p>
      PORTFOLIO WEB · PORTFOLIO WEB · PORTFOLIO WEB · PORTFOLIO WEB · PORTFOLIO WEB · PORTFOLIO WEB
      · PORTFOLIO WEB · PORTFOLIO WEB · PORTFOLIO WEB · PORTFOLIO WEB · PORTFOLIO WEB · PORTFOLIO
      WEB ·
    </p>
  </section>
</template>

<style lang="css" scoped>
section {
  width: 500%;
}
p {
  line-height: 3;
  letter-spacing: 2px;
}
h3 {
  font-size: 3.7rem;
  font-weight: 700;
  border-top: 2px solid #999;
  border-bottom: 2px solid #999;
}
.marquee {
  background-color: black;
  transform: translate(10px);
  & > * {
    animation: marquee linear;
    animation-timeline: view();
    @media (prefers-reduced-motion: reduce) {
      animation: none;
    }
  }
}

.reverse {
  animation: marquee linear;
  animation-direction: reverse;
  animation-timeline: view();
}

.marquee-phone,
.reverse-phone {
  display: none;
}

@keyframes marquee {
  to {
    transform: translateX(-10%);
  }
}

@media (width < 700px) {
  .marquee,
  .reverse {
    display: none;
  }
}
</style>
