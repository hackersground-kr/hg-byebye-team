import styled from "styled-components"

export default function Header() {
    const Background = styled.div`
        height: 7vh;
        width: 90%;
        border-bottom: 2px solid #E0E0E0;
        padding: 0 2%;
    `;

    return (
        <Background>
            <h1>Chapter.2</h1>
        </Background>
    )
}