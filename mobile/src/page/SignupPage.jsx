import React from 'react';
import styled from 'styled-components';

// 스타일 정의
const Container = styled.div`
    display: flex;
    flex-direction: column;
    width: 100%;
    height: 100vh;
    padding: 20px;
    box-sizing: border-box;
    background-color: #FFFFFF;
    font-family: 'Pretendard', sans-serif;
`;

const FormContainer = styled.div`
    flex: 9;
    margin-top: 90px;
`;

const Heading = styled.h1`
    font-size: 27px;
    font-weight: 700; /* Pretendard Bold */
    color: #000000;
`;

const Input = styled.input`
    width: 100%;
    height: 55px;
    margin-top: ${(props) => props.mt || '0'};
    padding: 0 10px;
    font-family: 'Pretendard Medium', sans-serif;
    font-size: 16px;
    border: 1px solid #BCBCBC;
    border-radius: 4px;
    box-sizing: border-box;

    &::placeholder {
        color: #BCBCBC;
    }
`;

const SignupButton = styled.button`
    width: 100%;
    height: 50px;
    margin: 10px 15px 0;
    background-color: #000000; /* bac_button color */
    color: #FFFFFF;
    font-size: 16px;
    font-weight: 700; /* Pretendard Bold */
    border: none;
    border-radius: 4px;
    cursor: pointer;
`;

const SignupPage = () => {
    return (
        <Container>
            <FormContainer>
                <Heading>회원가입해주세요.</Heading>
                <Input
                    id="signupEmailEdit"
                    type="email"
                    placeholder="아이디를 입력해주세요"
                />
                <Input
                    id="signupPasswordEdit"
                    type="password"
                    placeholder="비밀번호를 입력해주세요."
                    mt="20px"
                />
                <Input
                    type="text"
                    placeholder="이름을 입력해주세요."
                    mt="20px"
                />
                <Input
                    type="text"
                    placeholder="전화번호를 입력해주세요."
                    mt="20px"
                />
            </FormContainer>
            <SignupButton id="signupButton">회원가입</SignupButton>
        </Container>
    );
};

export default SignupPage;
