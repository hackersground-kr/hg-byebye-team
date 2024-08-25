import styled from "styled-components";
import DefaultInput from "../component/DefaultInput";
import DefualtButton from "../component/DefaultButton";

const Background = styled.div`
    width: 50%;
    height: 80%;
    margin: 2vh auto;
    text-align: center;
`;

const LoginPage = () => {
    return (
        <Background>
            <h1>Login</h1>
            <div style={{"marginBottom": "5vh"}}>
                <DefaultInput placeholder="아이디를 입력해주세요"></DefaultInput>
                <DefaultInput placeholder="비밀번호를 입력해주세요"></DefaultInput>
            </div>
            <DefualtButton text="로그인"></DefualtButton>
        </Background>
    )
}

export default LoginPage;