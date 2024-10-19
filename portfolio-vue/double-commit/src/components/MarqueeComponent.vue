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
  margin-block: 60px;
  width: 300%;
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

@keyframes marquee {
  to {
    transform: translateX(-10%);
  }
}

@media (width < 1000px) {
  .marquee,
  .reverse {
    display: none;
  }
}
</style>
