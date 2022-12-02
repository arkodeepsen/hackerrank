<title> Day 2: Conditional Statements: If-Else | HackerRank </title><meta name="description" id="meta-description" content="Learning about conditional statements."/><meta property="og:title" id="meta-og-title" content="Day 2: Conditional Statements: If-Else | HackerRank"/><meta property="og:image" id="meta-og-image" content="https://hrcdn.net/og/default.jpg"/><meta property="og:description" id="meta-og-description" content="Learning about conditional statements."/><meta property="og:url" id="meta-og-url" content="https://www.hackerrank.com/challenges/js10-if-else/copy-from/299999328"/><meta property="og:site_name" id="meta-og-site" content="HackerRank"/><meta property="og:type" id="meta-og-type" content="website"/><meta property="article:author" content="https://www.facebook.com/hackerrank"/><meta name="twitter:card" id="meta-twitter-card" content="summary"/><meta name="twitter:site" id="meta-twitter-site" content="@hackerrank"/><meta name="twitter:url" id="meta-twitter-url" content="https://www.hackerrank.com/challenges/js10-if-else/copy-from/299999328"/><meta name="twitter:title" id="meta-twitter-title" content="Day 2: Conditional Statements: If-Else | HackerRank"/><meta property="fb:app_id" id="meta-fb-id" content="347499128655783"/><meta name="theme-color" content="hsla(214.29, 15.56%, 26.47%, 1)"/><meta content="authenticity_token" name="csrf-param" id="csrf-param"/><meta content="AIDXbkfGrT8UY4HoWcnOBhitwrimISC8K+A930giPQS9jXb0RgEpYzM6KT2taYChSvmnraZJ7/q8fkumZeWc9Q==" name="csrf-token" id="csrf-token"/><link rel="canonical" href="https://www.hackerrank.com/challenges/js10-if-else/copy-from/299999328"/>
<script>
  window.BACKEND_ENDPOINT = 'https://www.hackerrank.com/';
  window.MANIFEST_VERSION = 'e10b98dc64';
</script>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" type="image/png" href="https://hrcdn.net/fcore/assets/favicon-ddc852f75a.png" />

<!-- Prefetch dns on production -->

  <link rel="dns-prefetch" href="//hrcdn.net">
  <link rel="dns-prefetch" href="//d3keuzeb2crhkn.cloudfront.net">
  <link rel="dns-prefetch" href="//notifications.hackerrank.com">
  <link rel="dns-prefetch" href="//api.mixpanel.com">
  <link rel="dns-prefetch" href="//metrics.hackerrank.com">
  <link rel="preconnect" href="https://sentry.io">
  <link rel="dns-prefetch" href="//sentry.io">
  <link rel="dns-prefetch" href="//browser.sentry-cdn.com">
  <link rel="dns-prefetch" href="//www.google-analytics.com">
  <link rel="dns-prefetch" href="//www.googletagmanager.com">



  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_app-253e6f58.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/hackerrank_r_app-47e0e98c.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_krackjack~hackerrank_r_testinvite~hackerrank_r_testquest~9083c7e4-92dd5284.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_test_question_create~hackerrank_r_test_question_update~h~ca4ca643-6b9a58b9.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_iframeable_pricing_container~hackerrank_r_work~hackerran~55e4f2f6-91ee907c.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_testinvite~hackerrank_r_testquestions~hackerrank_r_work-46dda33e.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_test_question_update~hackerrank_r_work-37b49fed.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_testquestions~hackerrank_r_work-4c9c6c71.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_testinvite~hackerrank_r_work-4181c6ef.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_packet_profile~hackerrank_r_sourcing_applications-018b2c93.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_work-7d7381b7.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_attempt_report~hackerrank_r_community-cb4a49ce.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community-082a4da0.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_community~hackerrank_r_insights_metrics~hackerrank_r_testreportslisting-94c56505.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_community-1e77e3e6.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/hackerrank_r_community-1b1d5db5.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_billing_settings~hackerrank_r_candidate_search_results~hackerrank_r_challenge~h~67df7a85-dcb7bd89.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_challenge~hackerrank_r_challenge_list~hackerrank_r_challenge_list_v2~hackerrank~47d5219c-3b0bb4fa.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_challenge~hackerrank_r_contest~hackerrank_r_leaderboard~hackerrank_r_leaderboardv2-3c2bfdf5.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_challenge~hackerrank_r_test_question_create~hackerrank_r_test_question_update-f335564a.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_challenge-19edad3a.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_challenge-82972292.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/commons~hackerrank_r_challenge~hackerrank_r_challenge_list~hackerrank_r_challenge_list_v2~hackerrank~f67eb52d-fdeb1b50.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/commons~hackerrank_r_challenge~hackerrank_r_contest~hackerrank_r_forum~hackerrank_r_leaderboard~hack~480eafbe-ca35de6d.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/commons~hackerrank_r_challenge~hackerrank_r_challenge_list~hackerrank_r_challenge_list_v2~hackerrank~12221734-2b7cd4f4.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/commons~hackerrank_r_challenge~hackerrank_r_contest~hackerrank_r_leaderboard~hackerrank_r_leaderboardv2-5ca65fba.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/commons~hackerrank_r_challenge~hackerrank_r_test_question_create~hackerrank_r_test_question_update-be707ccf.css">

  <link rel="stylesheet" type="text/css" href="https://hrcdn.net/fcore/assets/hackerrank_r_challenge-47b6663f.css">


<!-- Prefetch / preload assets on production -->


  <!-- preload scripts required on the same page -->
  <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/hackerrank_r_vendor-2bc7c1b2f5.js">
  <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/hackerrank_r_client-6a167118.js">
  <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/runtime-980086b8.js">
  <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/chunks_runtime-edb5f7909a.js">

  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_app-97221b42.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_app-7c3c64dd.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/hackerrank_r_app-6b918aa9.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_krackjack~hackerrank_r_testinvite~hackerrank_r_testquest~9083c7e4-d1b6c6cb.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_test_question_create~hackerrank_r_test_question_update~h~ca4ca643-3d4fcc94.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_iframeable_pricing_container~hackerrank_r_work~hackerran~55e4f2f6-597ffc7f.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_testinvite~hackerrank_r_testquestions~hackerrank_r_work-e341752b.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_test_question_update~hackerrank_r_work-196861a2.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_testquestions~hackerrank_r_work-5fabbba7.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_testinvite~hackerrank_r_work-14a9bad1.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_packet_profile~hackerrank_r_sourcing_applications-115c73ad.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_work-03d1218e.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_attempt_report~hackerrank_r_community-3429f568.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community~hackerrank_r_library-773f52d5.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_community-f621ddf4.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_community~hackerrank_r_test_question_create~hackerrank_r_test_question_update~h~d32fb7d8-83de1469.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_community~hackerrank_r_iframeable_pricing_container~hackerrank_r_work~hackerran~ac41a930-db9dda76.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_community~hackerrank_r_testinvite~hackerrank_r_testquestions~hackerrank_r_work-536aa6b4.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_community~hackerrank_r_insights_metrics~hackerrank_r_testreportslisting-4cdfb1e0.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_community~hackerrank_r_library~hackerrank_r_packet_profile-75bd061e.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_community~hackerrank_r_testinvite~hackerrank_r_work-9f37f3be.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_community~hackerrank_r_work-7d1c07aa.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_community~pubsub_util-3e62115e.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_community-e5fa95f4.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/commons~hackerrank_r_community~hackerrank_r_work-1d593ae2.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/commons~hackerrank_r_community~hackerrank_r_sourcing_applications-9d0b5d5b.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/hackerrank_r_community-c6af6776.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_billing_settings~hackerrank_r_candidate_search_results~hackerrank_r_challenge~h~67df7a85-8292b3e0.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_challenge~hackerrank_r_challenge_list~hackerrank_r_challenge_list_v2~hackerrank~47d5219c-63c0ba7f.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_challenge~hackerrank_r_contest~hackerrank_r_leaderboard~hackerrank_r_leaderboardv2-1ef1c3c5.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_challenge~hackerrank_r_test_question_create~hackerrank_r_test_question_update-0603ab1e.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_challenge~hackerrank_r_skills_verification-a433d4a2.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/modules~hackerrank_r_challenge-614265f7.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_challenge~hackerrank_r_challenge_list~hackerrank_r_challenge_list_v2~hackerrank~0f19adfd-3dd2e597.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_challenge~hackerrank_r_test_question_create~hackerrank_r_test_question_update-25f94df9.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_challenge-0f5e2564.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/commons~hackerrank_r_challenge~hackerrank_r_challenge_list~hackerrank_r_challenge_list_v2~hackerrank~f67eb52d-185902d6.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/commons~hackerrank_r_challenge~hackerrank_r_contest~hackerrank_r_forum~hackerrank_r_leaderboard~hack~480eafbe-0318a4c6.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/commons~hackerrank_r_challenge~hackerrank_r_challenge_list~hackerrank_r_challenge_list_v2~hackerrank~12221734-1e24c082.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/commons~hackerrank_r_challenge~hackerrank_r_contest~hackerrank_r_leaderboard~hackerrank_r_leaderboardv2-e539768b.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/commons~hackerrank_r_challenge~hackerrank_r_test_question_create~hackerrank_r_test_question_update-bf0faf36.js">
  
    <link rel="preload" as="script" href="https://hrcdn.net/fcore/assets/hackerrank_r_challenge-4cb691ac.js">
  
  <!-- preload scripts end -->



<!-- Load promise polyfill for the non-believers -->
<script>
  (window.Promise && window.Promise.prototype.finally) || document.write('<script src="https://hrcdn.net/fcore/assets/polyfill-d05a380d50.min.js" type="text\/javascript"><\/script>');
</script>
