# `정신나갈것같네` - `Chapter.2`

해커그라운드 해커톤에 참여하는 `정신나갈것같네` 팀의 `Chapter.2`입니다.

## 참고 문서

> 아래 두 링크는 해커톤에서 앱을 개발하면서 참고할 만한 문서들입니다. 이 문서들에서 언급한 서비스 이외에도 더 많은 서비스들이 PaaS, SaaS, 서버리스 형태로 제공되니 참고하세요.

- [순한맛](./REFERENCES_BASIC.md)
- [매운맛](./REFERENCES_ADVANCED.md)

## 제품/서비스 소개

<!-- 아래 링크는 지우지 마세요 -->
[제품/서비스 소개 보기](TOPIC.md)
<!-- 위 링크는 지우지 마세요 -->

## 오픈 소스 라이센스

<!-- 아래 링크는 지우지 마세요 -->
[오픈소스 라이센스 보기](./LICENSE)
<!-- 위 링크는 지우지 마세요 -->

## 설치 방법

> **아래 제공하는 설치 방법을 통해 심사위원단이 여러분의 제품/서비스를 실제 Microsoft 애저 클라우드에 배포하고 설치할 수 있어야 합니다. 만약 아래 설치 방법대로 따라해서 배포 및 설치가 되지 않을 경우 본선에 진출할 수 없습니다.**

### 사전 준비 사항

> **여러분의 제품/서비스를 Microsoft 애저 클라우드에 배포하기 위해 사전에 필요한 준비 사항들을 적어주세요.**
> 
InteliJ, Docker Desktop, Github 계정, Microsoft 계정 (권한이 있어야합니다.), 자바 jdk-17가 필요합니다.
> https://www.jetbrains.com/ko-kr/idea/download/
> https://docs.docker.com/desktop/install/mac-install/
> 
해당 링크에 접속하여 InteliJ와 DockerDesktop을 설치해주세요. 사양은 본인의 환경에 맞게 설정합니다.

window에서의 InteliJ
>https://aday7.tistory.com/entry/IntelliJ-%EC%84%A4%EC%B9%98-%EB%B0%8F-%EA%B8%B0%EB%B3%B8-%ED%99%98%EA%B2%BD-%EC%84%A4%EC%A0%95-%EA%B0%80%EC%9D%B4%EB%93%9C
> 
Mac
> https://how-can-i.tistory.com/127
> 
블로그에 따라 로그인, 회원가입까지 진행해주시면 되겠습니다.
## 시작하기

>https://github.com/hackersground-kr/hg-byebye-team.git 링크를 복사합니다.
> 
>https://git-scm.com/ 에서 Git을 다운로드하고 설치합니다.
> 
>https://goddaehee.tistory.com/216 를 참고하여 깃 설치를 마무리합니다. window
> 
>https://velog.io/@wijoonwu/Mac-OS-%EC%97%90%EC%84%9C-Git-%EC%84%A4%EC%B9%98%ED%95%98%EA%B8%B0 mac

터미널(또는 명령 프롬프트)을 열고, 프로젝트를 저장할 폴더로 이동합니다. 예를 들어, 바탕화면에 클론하고 싶다면 다음과 같이 입력합니다
> cd ~/Desktop  <- Mac

> cd %USERPROFILE%\Desktop  <- Windows

리포지토리를 클론합니다.
> git clone https://github.com/hackersground-kr/hg-byebye-team.git
> 
IntelliJ IDEA를 실행합니다.
•	처음 시작 시, “Open” 또는 “Import Project”를 선택합니다.
•	클론한 프로젝트 폴더를 선택하고 “OK”를 클릭합니다.
•	IntelliJ가 프로젝트 설정을 자동으로 인식하고 설정을 완료합니다.
경고창이 나타날 시, Trust Project를 선택합니다.
왼쪽 하단의 >_ 모양의 아이콘인 터미널을 클릭하여 실행 시킨 뒤, 콘솔에 다음 명령어를 입력해주세요.
>./gradlew build -x test

Docker Desktop을 실행시킵니다.

mac의 터미널에서 해당 명령어를 입력합니다.
>brew install azure/azure-cli/azd
>
window의 경우
> winget install microsoft.azd

설치 후 
>azd login
>
을 입력하여 

> **여러분의 제품/서비스를 Microsoft 애저 클라우드에 배포하기 위한 절차를 구체적으로 나열해 주세요.**
