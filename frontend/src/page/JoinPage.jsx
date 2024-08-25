import styled from "styled-components";
import DefaultInput from "../component/DefaultInput";
import DefualtButton from "../component/DefaultButton";

const Background = styled.div`
    width: 50%;
    height: 80%;
    margin: 2vh auto;
    text-align: center;
`;

const JoinPage = () => {
    return (
        <Background>
            <h1>Join</h1>
            <div style={{"marginBottom": "5vh"}}>
                <DefaultInput placeholder="아이디를 입력해주세요"></DefaultInput>
                <DefaultInput placeholder="비밀번호를 입력해주세요"></DefaultInput>
                <DefaultInput placeholder="이름을 입력해주세요"></DefaultInput>
                <DefaultInput placeholder="전화번호를 입력해주세요"></DefaultInput>
            </div>
            <DefualtButton text="회원가입"></DefualtButton>
        </Background>
    )
}

export default JoinPage;